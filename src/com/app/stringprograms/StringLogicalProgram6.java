package com.app.stringprograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringLogicalProgram6 {
	
	// By using Pattern class matcher method
	public static boolean isStringContainNumbers1(String input) {
		Pattern pattern = Pattern.compile("[1234567890]");
		
		boolean result = pattern.matcher(input).find();
		return result;
	}
	
	// By using String class contains method
	public static boolean isStringContainNumbers2(String input) {
		boolean result = false;
		String numbers = "1234567890";
		
		for(int i=0; i<numbers.length(); i++) {
			if(input.contains(String.valueOf(numbers.charAt(i)))){
				result = true;
				break;
			}
		}
		
		return result;
	}
	
	// By using String class replaceAll, equals method
	public static boolean isStringContainNumbers3(String input) {
		String regex = "[1234567890]";
		
		String modifiedString = input.replaceAll(regex, input);
		boolean result = input.equals(modifiedString);
		
		return result;
	}
	
	// By using Loops
	public static boolean isStringContainNumbers4(String input) {
		boolean result = false;
		char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		char[] inputArray = input.toCharArray();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<inputArray.length; j++) {
				if(inputArray[j] == numbers[i]) {
					result = true;
					break;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String input = scanner.nextLine();
		
		System.out.println("-------- By using Pattern class predefined method -------");
		boolean result1 = isStringContainNumbers1(input);
		if(result1) {
			System.out.println(input+" is contain Numbers.");
		}else {
			System.out.println(input+" is not contain Numbers.");
		}
		
		System.out.println("-------- By using String class contains method -------");
		boolean result2 = isStringContainNumbers2(input);
		if(result2) {
			System.out.println(input+" is contain Numbers.");
		}else {
			System.out.println(input+" is not contain Numbers.");
		}
		
		System.out.println("-------- By using String class replaceAll, equals method -------");
		boolean result3 = isStringContainNumbers3(input);
		if(result3) {
			System.out.println(input+" is contain Numbers.");
		}else {
			System.out.println(input+" is not contain Numbers.");
		}
		
		System.out.println("-------- By using Loops -------");
		boolean result4 = isStringContainNumbers4(input);
		if(result4) {
			System.out.println(input+" is contain Numbers.");
		}else {
			System.out.println(input+" is not contain Numbers.");
		}
	}

}
