package com.app.arrayprograms;

public class ArrayProgram3 {
	
	public static Integer[] sortAscendingOrderMiddleValues(Integer[] input) {
		Integer temp;
		
		for(int i=1; i<input.length-1; i++) {
			for(int j=i+1; j<input.length-1; j++) {
				if(input[i]>input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		Integer[] input = { 15, 2, 5, 10, 4, 3, 1, 2 };

		Integer[] result = ArrayProgram3.sortAscendingOrderMiddleValues(input);

		for (int i = 0; i < result.length; i++) {
			if (i == result.length - 1) {
				System.out.print(result[i]);
			} else {
				System.out.print(result[i] + ", ");
			}
		}
	}
}
