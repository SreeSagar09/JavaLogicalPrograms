package com.app.arrayprograms;

public class ArrayProgram7 {
	
	public static Integer[] moveZerosToStart(Integer[] input) {
		int zeroPosition = input.length-1;
		Integer temp;
		
		for(int i=input.length-1; i>=0; i--) {
			if(input[i] != 0) {
				temp = input[i];
				input[i] = input[zeroPosition];
				input[zeroPosition] = temp;
				
				zeroPosition--;
			}
		}
		
		
		return input;
	}
	
	public static void main(String[] args) {
		Integer[] input = {0, 4, 5, 8, 0, 3, 7};
		
		System.out.println("Original integer array");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
		
		input = moveZerosToStart(input);
		
		System.out.println("\nZero's moved to start");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
	}
}
