package com.app.arrayprograms;

public class ArrayProgram5 {
	
	public static String[] sortDescendingOrder(String[] input) {
		String temp;
		
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i].compareToIgnoreCase(input[j])<0) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		String[] input = {"AB", "AAB", "BC", "BA", "AA"};

		String[] result = ArrayProgram5.sortDescendingOrder(input);

		for(int i=0; i<result.length; i++) {
			if(i == result.length-1) {
				System.out.print(result[i]);
			}else {
				System.out.print(result[i]+", ");
			}
		}
	}
}
