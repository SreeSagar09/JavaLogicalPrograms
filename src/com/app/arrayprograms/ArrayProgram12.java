package com.app.arrayprograms;

public class ArrayProgram12 {
	public static void printPossibleSubArrays(Integer[] input) {
		for(int i=0; i<input.length; i++) {
			for(int j=i; j<input.length; j++) {
				for(int k=i; k<=j; k++) {
					if(k == j) {
						System.out.println(input[k]);
					}else {
						System.out.print(input[k]+", ");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] input = {1, 2, 3, 4, 5};
		
		System.out.println("Original array:");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
		
		System.out.println("\nPossible sub arrays:");
		printPossibleSubArrays(input);
	}
}
