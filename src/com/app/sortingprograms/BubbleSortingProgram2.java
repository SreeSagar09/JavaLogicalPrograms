package com.app.sortingprograms;

public class BubbleSortingProgram2 {

	// To sort ascending order by using bubble sorting
	public static int[] sortingAsc(int[] input) {
		int length = input.length;
		int temp;
		for(int i=0; i<length-1; i++) {
			for(int j=i; j<length-1; j++) {
				if(input[i] > input[j+1]) {
					temp = input[i];
					input[i] = input[j+1];
					input[j+1] = temp;
				}
			}
		}

		return input;
	}

	// To sort descending order by using bubble sorting
	public static int[] sortingDesc(int[] input) {
		int length = input.length;
		int temp;

		for(int i=0; i<length-1; i++) {
			for(int j=i; j<length-1; j++) {
				if(input[i] < input[j+1]) {
					temp = input[i];
					input[i] = input[j+1];
					input[j+1] = temp;
				}
			}
		}

		return input;
	}

	public static void main(String[] args) {
		int[] input1 = {5, 8, 2, 3, 1, 4};

		System.out.println("Before sorting");
		for(int i : input1) {
			System.out.print(i+" ");
		}

		sortingAsc(input1);

		System.out.println("\nAfter sorting ascending order");
		for(int i : input1) {
			System.out.print(i+" ");
		}

		int[] input2 = {5, 8, 2, 3, 1, 4};

		System.out.println("\nBefore sorting");
		for(int i : input2) {
			System.out.print(i+" ");
		}

		sortingDesc(input2);

		System.out.println("\nAfter sorting descending order");
		for(int i : input2) {
			System.out.print(i+" ");
		}
	}
}
