package com.app.stringprograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringLogicalProgram7 {
	
	// By using Arrays class sort, equals methods
	public static boolean isGivenStringsAnagram1(String input1, String input2) {
		boolean result = false;
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		
		if(input1.length() != input2.length()) {
			return result;
		}else {
			char[] charArray1 = input1.toCharArray();
			char[] charArray2 = input2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			result = Arrays.equals(charArray1, charArray2);
		}
		
		return result;
	}
	
	// By using String class replaceFirst, isEmpty methods
	public static boolean isGivenStringsAnagram2(String input1, String input2) {
		boolean result = false;
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		
		if(input1.length() != input2.length()) {
			return result;
		}else {
			for(int i=0; i<input1.length(); i++) {
				String charString = String.valueOf(input1.charAt(i));
				if(input2.indexOf(charString) != -1) {
					input2 = input2.replaceFirst(charString, "");
				}else {
					return result;
				}
			}
			
			result = input2.isEmpty();
		}
		
		return result;
	}
	
	// By using StringBuffer class deleteCharAt, indexOf methods
	public static boolean isGivenStringsAnagram3(String input1, String input2) {
		boolean result = false;
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		
		if(input1.length() != input2.length()) {
			return result;
		}else {
			StringBuffer stringBuffer = new StringBuffer(input2);
			for(int i=0; i<input1.length(); i++) {
				String charString = String.valueOf(input1.charAt(i));
				int index = stringBuffer.indexOf(charString);
				if(index != -1) {
					stringBuffer.deleteCharAt(index);
				}else {
					return result;
				}
			}
			
			result = stringBuffer.toString().isEmpty();
		}
		
		return result;
	}
	
	// By using Loops
	public static boolean isGivenStringsAnagram4(String input1, String input2) {
		boolean result = false;
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();
		
		if(input1.length() != input2.length()) {
			return result;
		}else {
			char[] inputArray1 = input1.toCharArray();
			char[] inputArray2 = input2.toCharArray();
			
			for(int i=0; i<inputArray1.length; i++) {
				boolean isCharFound = false;
				for(int j=0; j<inputArray2.length; j++) {
					if(inputArray1[i] == inputArray2[j]) {
						inputArray2[j] = '\u0000';
						isCharFound = true;
						break;
					}
				}
				
				if(!isCharFound) {
					result = false;
					break;
				}
			}
			
			for(int i=0; i<inputArray2.length; i++) {
				if(inputArray2[i] != '\u0000') {
					result = false;
					break;
				}else {
					result = true;
				}
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first string:");
		String input1 = scanner.nextLine();
		
		System.out.println("Please enter second string:");
		String input2 = scanner.nextLine();
		
		System.out.println("----- By using Arrays class sort, equals methods -------");
		boolean result1 = isGivenStringsAnagram1(input1, input2);
		if(result1) {
			System.out.println(input1+", "+input2+" both are anagram strings.");
		}else {
			System.out.println(input1+", "+input2+" both are not anagram strings.");
		}
		
		System.out.println("----- By using String class replaceFirst, isEmpty methods -------");
		boolean result2 = isGivenStringsAnagram2(input1, input2);
		if(result2) {
			System.out.println(input1+", "+input2+" both are anagram strings.");
		}else {
			System.out.println(input1+", "+input2+" both are not anagram strings.");
		}
		
		System.out.println("----- By using StringBuffer class deleteCharAt, indexOf methods -------");
		boolean result3 = isGivenStringsAnagram3(input1, input2);
		if(result3) {
			System.out.println(input1+", "+input2+" both are anagram strings.");
		}else {
			System.out.println(input1+", "+input2+" both are not anagram strings.");
		}
		
		System.out.println("----- By using Loops -------");
		boolean result4 = isGivenStringsAnagram4(input1, input2);
		if(result4) {
			System.out.println(input1+", "+input2+" both are anagram strings.");
		}else {
			System.out.println(input1+", "+input2+" both are not anagram strings.");
		}
	}

}
