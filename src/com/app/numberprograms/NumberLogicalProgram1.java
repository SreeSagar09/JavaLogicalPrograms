package com.app.numberprograms;

import java.util.Scanner;

public class NumberLogicalProgram1 {
	
	// By using modulus operator
	public static boolean isEvenNumber1(int input) {
		boolean isEvenNumber = false;
		
		isEvenNumber = input%2 == 0;
		return isEvenNumber;
	}
	
	// By using bit wise AND operator
	public static boolean isEvenNumber2(int input) {
		boolean isEvenNumber = false;
		
		isEvenNumber = (input&1) == 0;
		return isEvenNumber;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		
		int input = scanner.nextInt();
		
		System.out.println("By using modulus operator");
		boolean result1 = isEvenNumber1(input);
		if(result1) {
			System.out.println(input+" :is Even Number");
		}else {
			System.out.println(input+" :is Odd Number");
		}
		
		System.out.println("By using bit wise AND operator");
		boolean result2 = isEvenNumber2(input);
		if(result2) {
			System.out.println(input+" :is Even Number");
		}else {
			System.out.println(input+" :is Odd Number");
		}
	}

}
