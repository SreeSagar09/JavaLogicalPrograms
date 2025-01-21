package com.app.stringprograms;

import java.util.Scanner;

public class StringLogicalProgram12 {
	
	// By using Loops
	public static Integer getNumberOfVowels1(String input) {
		Integer numberOfVowels = 0;
		char[] inputArray = input.toCharArray();
		char[] vowelsArray = {'a','e','i','o','u','A','E','I','O','U'};
		
		for(int i=0; i<inputArray.length; i++) {
			for(int j=0; j<vowelsArray.length; j++) {
				if(inputArray[i] == vowelsArray[j]) {
					numberOfVowels++;
					break;
				}
			}
		}
		
		return numberOfVowels;
	}
	
	// By using String class contains methods
	public static Integer getNumberOfVowels2(String input) {
		Integer numberOfVowels = 0;
		String vowelsString = "aeiouAEIOU";
		
		for(int i=0; i<input.length(); i++) {
			if(vowelsString.contains(String.valueOf(input.charAt(i)))) {
				numberOfVowels++;
			}
		}
		
		return numberOfVowels;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string");
		String input = scanner.nextLine();
		
		System.out.println("-------- By using Loops ----------");
		Integer vowelsCount1 = getNumberOfVowels1(input);
		System.out.println(vowelsCount1);
		
		System.out.println("-------- By using String class contains methods ----------");
		Integer vowelsCount2 = getNumberOfVowels1(input);
		System.out.println(vowelsCount2);
	}

}
