package com.app.arrayprograms;

public class ArrayProgram11 {
	
	public static Integer bruteForceApproach(Integer[] input) {
		Integer maxSum = input[0];
		Integer currentSum = 0;
		
		for(int i=0; i<input.length; i++) {
			currentSum = 0;
			for(int j=i; j<input.length; j++) {
				currentSum = currentSum+input[j];
				maxSum = maxSum>currentSum?maxSum:currentSum;
			}
		}
		
		return maxSum;
	}
	
	public static Integer kadaneAlgorithm(Integer[] input) {
		Integer maxSum = input[0];
		Integer currentSum = 0;
		
		for(int i=0; i<input.length; i++) {
			currentSum = currentSum+input[i];
			maxSum = maxSum>currentSum?maxSum:currentSum;
			
			if(currentSum<0) {
				currentSum = 0;
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		Integer[] input = {-1, 7, -3, 4, -6};
		
		Integer maxSum1 = bruteForceApproach(input);
		System.out.println("Max sum by BruteForce approach: "+maxSum1);
		
		Integer maxSum2 = kadaneAlgorithm(input);
		System.out.println("Max sum by Kadane algorithm: "+maxSum2);
 	}

}
