package com.app.arrayprograms;

public class ArrayProgram6 {
	
	public static Integer[] moveZerosToEnd(Integer[] input) {
		int zeroPosition = 0;
		Integer temp; 
		
		for(int i=0; i<input.length; i++) {
			if(input[i] != 0) {
				temp = input[i];
				input[i] = input[zeroPosition];
				input[zeroPosition] = temp;
				
				zeroPosition++;
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
		
		input = moveZerosToEnd(input);
		
		System.out.println("\nZero's moved to end");
		for(int i=0; i<input.length; i++) {
			if(i == input.length-1) {
				System.out.print(input[i]);
			}else {
				System.out.print(input[i]+", ");
			}
		}
 	}

}
