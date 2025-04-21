package com.app.arrayprograms;

public class ArrayProgram2 {
	
	public static Integer[] sortDescendingOrder(Integer[] input) {
		Integer temp;
		
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i]<input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		Integer[] input = {15, 2, 5, 10, 4, 3, 1, 2};
		
		Integer[] result = ArrayProgram2.sortDescendingOrder(input);
		
		for(int i=0; i<result.length; i++) {
			if(i == result.length-1) {
				System.out.print(result[i]);
			}else {
				System.out.print(result[i]+", ");
			}
		}
	}
}
