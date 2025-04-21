package com.app.sortingprograms;

public class SelectionSortingProgram1 {

	public static int[] sortingAsc(int[] input) {
		int length = input.length;

		int temp, minIndex;
		for(int i=0; i<length-1; i++) {

			minIndex = i;
			for(int j=i+1; j<length; j++) {
				if(input[j] < input[minIndex]) {
					minIndex = j;
				}
				temp = input[minIndex];
				input[minIndex] = input[i];
				input[i] = temp;
			}
		}

		return input;
	}

	public static void main(String[] args) {
		int[] input1 = {5, 8, 2, 3, 1};

		System.out.println("Before sorting");
		for(int i : input1) {
			System.out.print(i+" ");
		}

		sortingAsc(input1);

		System.out.println("\nAfter sorting ascending order");
		for(int i : input1) {
			System.out.print(i+" ");
		}

	}

}
