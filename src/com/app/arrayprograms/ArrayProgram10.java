package com.app.arrayprograms;

public class ArrayProgram10 {
	
	public static Integer[] reverseTheArray(Integer[] input) {
		if(input.length == 0) {
			return input;
		}
		
		int start = 0;
		int end = input.length-1;
		Integer temp;
		
		while(start<end) {
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			
			start++;
			end--;
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		Integer[] input = {0, 1, 2, 3, 4, 5, 6};
		
		System.out.println("Original integer array");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
		
		input = reverseTheArray(input);
		
		System.out.println("\nReversed integer array");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
	}
}
