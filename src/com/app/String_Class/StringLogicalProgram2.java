package com.app.String_Class;

import java.util.Scanner;

public class StringLogicalProgram2 {
	public static String reverseString(String input) {
		if(input != null && !input.trim().isEmpty()) {
			String output = "";
			String[] stringArray = input.split(" ");
			for(int i=0; i<stringArray.length; i++) {
				output = output.isEmpty()?stringArray[i]:stringArray[i]+" "+output;
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
		String output = StringLogicalProgram2.reverseString(input);
		System.out.println(output);
	}

}
