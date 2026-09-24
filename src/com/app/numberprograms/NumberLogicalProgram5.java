package com.app.numberprograms;

public class NumberLogicalProgram5 {
	public static int[] findMinSizeSubArraySumGreaterThanValue(int[] input, int target) {
		if(input == null || input.length == 0) {
			return new int[0];
		}
		
		int allSum = 0;
		for(int i : input) {
			allSum += i;
		}
		
		if(allSum<target) {
			return new int[0];
		}
		
		int left = 0;
		int minStart = 0;
		int minLength = input.length+1;
		int currentSum = 0;
		
		for(int right=0; right<input.length; right++) {
			currentSum += input[right];
			
			while(currentSum>target) {
				if(right-left+1<minLength) {
					minStart = left;
					minLength = right-left+1;
				}
				
				currentSum -= input[left];
				left++;
			}
		}
		
		int[] result = new int[minLength];
		for(int i=0; i<minLength; i++) {
			result[i] = input[minStart+i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] input = {2, 1, 4, 3, 1};
		int target = 6;
		
		int[] result = findMinSizeSubArraySumGreaterThanValue(input, target);
		
		System.out.println("Sub Array values: ");
		for(int i : result) {
			System.out.println(i);
		}
	}
}
