package com.app.arrayprograms;

public class ArrayProgram9 {
	
	public static Integer getMinValueIndex(Integer[] input) {
		if(input.length == 0) {
			return -1;
		}
		
		int minValueIndex = 0;
		
		for(int i=0; i<input.length; i++) {
			if(input[i] < input[minValueIndex]) {
				minValueIndex = i;
			}
		}
		
		return minValueIndex;
	}
	
	public static Integer getMaxValueIndex(Integer[] input) {
		if(input.length == 0) {
			return -1;
		}
		
		int maxValueIndex = 0;
		
		for(int i=0; i<input.length; i++) {
			if(input[i] > input[maxValueIndex]) {
				maxValueIndex = i;
			}
		}
		
		return maxValueIndex;
	}
	
	public static void main(String[] args) {
		Integer[] input = {6, 15, 7, 8, 9, 3, 10};
		
		System.out.println("Original integer array");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
		
		System.out.println("\nMin value index: "+getMinValueIndex(input));
		System.out.println("Max value index: "+getMaxValueIndex(input));
	}
}
