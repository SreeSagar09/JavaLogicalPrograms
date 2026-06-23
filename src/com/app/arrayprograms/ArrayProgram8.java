package com.app.arrayprograms;

public class ArrayProgram8 {
	
	public static Integer findMinValue(Integer[] input) {
		if(input.length == 0) {
			return null;
		}
		
		Integer minValue = input[0];
		
		for(int i=0; i<input.length; i++) {
			if(input[i] < minValue) {
				minValue = input[i];
			}
		}
		
		return minValue;
	}
	
	public static Integer findMaxValue(Integer[] input) {
		if(input.length == 0) {
			return null;
		}
		
		Integer maxValue = input[0];
		
		for(int i=0; i<input.length; i++) {
			if(input[i] > maxValue) {
				maxValue = input[i];
			}
		}
		
		return maxValue;
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
		
		System.out.println("\nMin value: "+findMinValue(input));
		System.out.println("Max value: "+findMaxValue(input));
	}
}
