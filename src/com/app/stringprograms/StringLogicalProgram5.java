package com.app.stringprograms;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringLogicalProgram5 {

	// By using Pattern class matcher method
	public static boolean isStringContainVowels1(String input) {
		Pattern pattern = Pattern.compile("[aeiouAEIOU]");
		boolean result = pattern.matcher(input).find();

		return result;
	}

	// By using String class contains method
	public static boolean isStringContainVowels2(String input) {
		boolean result = false;
		String vowels = "aeiouAEIOU";

		for(int i=0; i<vowels.length(); i++) {
			if(input.contains(String.valueOf(vowels.charAt(i)))) {
				result = true;
				break;
			}
		}

		return result;
	}

	// By using String class replaceAll, equals methods
	public static boolean isStringContainVowels3(String input) {
		String regex = "[aeiouAEIOU]";
		
		String modifiedInput = input.replaceAll(regex, "");
		boolean result = input.equals(modifiedInput);
		
		return result;
	}

	// By using Loops
	public static boolean isStringContainVowels4(String input) {
		boolean result = false;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		char[] inputArray = input.toCharArray();
		
		for(int i=0; i<vowels.length; i++) {
			for(int j=0; j<inputArray.length; j++) {
				if(inputArray[j] == vowels[i]) {
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

		System.out.println("----- By using Pattern class matcher method -------");
		boolean result1 = isStringContainVowels1(input);
		if (result1) {
			System.out.println(input + " is contain Vowels.");
		} else {
			System.out.println(input + " is not contain Vowels.");
		}

		System.out.println("----- By using String class contains method -------");
		boolean result2 = isStringContainVowels2(input);
		if (result2) {
			System.out.println(input + " is contain Vowels.");
		} else {
			System.out.println(input + " is not contain Vowels.");
		}

		System.out.println("----- By using String class replaceAll, equals methods -------");
		boolean result3 = isStringContainVowels4(input);
		if (result3) {
			System.out.println(input + " is contain Vowels.");
		} else {
			System.out.println(input + " is not contain Vowels.");
		}
		
		System.out.println("----- By using Loops -------");
		boolean result4 = isStringContainVowels4(input);
		if (result4) {
			System.out.println(input + " is contain Vowels.");
		} else {
			System.out.println(input + " is not contain Vowels.");
		}
	}

}
