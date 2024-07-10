package com.app.String_Class;

import java.util.Scanner;

public class StringLogicalProgram1 {
	public static String reverseString(String input) {
		if(input != null) {
			String output = "";
			for(int i=0; i<input.length(); i++) {
				output = input.charAt(i)+output;
			}
			return output;
		}else {
			return input;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter String:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output = StringLogicalProgram1.reverseString(input);
		System.out.println(output);
	}
}
