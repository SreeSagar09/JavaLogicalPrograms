package com.app.stringprograms;

import java.util.Scanner;

public class StringLogicalProgram8 {
	
	// By using StringBuffer class reverse method
	public static boolean isGivenStringPalindrome1(String input) {
		boolean result = false;
		
		input = input.replaceAll("\\s", "").toLowerCase();
		
		StringBuffer stringBuffer = new StringBuffer(input);
		String reverse = stringBuffer.reverse().toString();
		
		result = input.equals(reverse);
		
		return result;
	}
	
	// By using String class replace, charAt and equals methods
	public static boolean isGivenStringPalindrome2(String input) {
		boolean result = false;
		
		input = input.replaceAll("\\s", "").toLowerCase();
		String reverse = "";
		
		for(int i=0; i<input.length(); i++) {
			reverse = input.charAt(i)+reverse;
		}
		
		result = input.equals(reverse);
		
		return result;
	}
	
	// By using Loops
	public static boolean isGivenStringPalindrome3(String input) {
		boolean result = true;
		
		input = input.replaceAll("\\s", "");
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) != input.charAt(input.length()-1-i)) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input string:");
		String input = scanner.nextLine();
		
		System.out.println("---- By using StringBuffer class reverse method ----");
		boolean result1 = isGivenStringPalindrome1(input);
		if(result1) {
			System.out.println(input+" is palindrome string");
		}else {
			System.out.println(input+" is not palindrome string");
		}
		
		System.out.println("---- By using String class replace, charAt and equals methods ----");
		boolean result2 = isGivenStringPalindrome2(input);
		if(result2) {
			System.out.println(input+" is palindrome string");
		}else {
			System.out.println(input+" is not palindrome string");
		}
		
		System.out.println("----- By using Loops ------");
		boolean result3 = isGivenStringPalindrome3(input);
		if(result3) {
			System.out.println(input+" is palindrome string");
		}else {
			System.out.println(input+" is not palindrome string");
		}
	}
}
