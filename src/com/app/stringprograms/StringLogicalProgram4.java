package com.app.stringprograms;

import java.util.Scanner;

public class StringLogicalProgram4 {
	
	public static String moveEnding1(String input, char element) {
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
	
	public static String moveEnding2(String input, char element) {
		for(int i=0; i<input.length(); i++) {
			input = input.replaceFirst(String.valueOf(element), "");
			input = input+String.valueOf(element);
		}
		
		return input;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String input = scanner.nextLine();

		System.out.println("Enter character to move ending:");
		char element = scanner.nextLine().charAt(0);
		System.out.println("------ By converting into Array ------");
		String result1 = moveEnding1(input, element);
		System.out.println(result1);
		System.out.println("-------- By using String Class replaceFirst method -------");
		String result2 = moveEnding2(input, element);
		System.out.println(result2);
	}

}
