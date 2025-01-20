package com.app.numberprograms;

import java.util.Scanner;

public class NumberLogicalProgram2 {
	
	// By using modulus and arithmetic operator
	public static int reverseTheInt1(int input) {
		int result = 0;
		
		while(input >0) {
			int temp = input%10;
			result = (result*10) + temp;
			input = input/10;
		}
		
		return result;
	}
	
	// By using String class methods
	public static int reverseTheInt2(int input) {
		int result = 0;
		String inputStr = String.valueOf(input);
		String resultStr = "";
		
		for(int i=0; i<inputStr.length(); i++) {
			resultStr = inputStr.charAt(i)+resultStr;
		}
		
		result = Integer.valueOf(resultStr).intValue();
		return result;
	}
	
	// By using StringBuilder class reverse method
	public static int reverseTheInt3(int input) {
		int result = 0;
		StringBuilder inputStringBuilder = new StringBuilder(String.valueOf(input));
		result = Integer.valueOf(inputStringBuilder.reverse().toString()); 
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter number");
		int input = scanner.nextInt();
		
		System.out.println("By using modulus and arithmetic operator");
		int result1 = reverseTheInt1(input);
		System.out.println("Original number: "+input+", Reverse number: "+result1);
		
		System.out.println("By using String class methods");
		int result2 = reverseTheInt2(input);
		System.out.println("Original number: "+input+", Reverse number: "+result2);
		
		System.out.println("By using StringBuilder class reverse method");
		int result3 = reverseTheInt3(input);
		System.out.println("Original number: "+input+", Reverse number: "+result3);
	}

}
