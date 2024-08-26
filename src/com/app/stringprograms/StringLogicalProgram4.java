package com.app.stringprograms;

import java.util.Scanner;

public class StringLogicalProgram4 {
	
	public static String moveEnding(String input, char element) {
		char[] array = input.toCharArray();
		int length = array.length;
		int index = array.length-1;
		
		for(int i=length-1; i>=0; i--) {
			if(array[i] == element) {
				char charAtIndex = array[index];
				array[index] = element;
				index--;
				for(int j=i; j<=index; j++) {
					if(j == index) {
						array[j] = charAtIndex;
					}else {
						array[j] = array[j+1];
					}
				}
			}
		}
		
		return new String(array);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String input = scanner.nextLine();

		System.out.println("Enter character to move ending:");
		char element = scanner.nextLine().charAt(0);
		String result = moveEnding(input, element);
		System.out.println(result);
	}

}
