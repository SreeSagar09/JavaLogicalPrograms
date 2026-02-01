package com.app.searchprograms;

public class LinearSearchProgram1 {
	
	public static int searchFor(int[] input, int n) {
		for(int i=0; i<input.length; i++) {
			if(input[i] == n) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] input = {2, 4, 5, 1, 0, 8, 3};
		int n = 9;
		
		int index = searchFor(input, n);
		System.out.println("Index of "+n+" is: "+index);
	}
}
