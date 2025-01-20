package com.app.numberprograms;

import java.util.Scanner;

public class NumberLogicalProgram3 {
	
	// Swap two numbers using third variable
	public static void swapTwoNumbers1(int a, int b) {
		System.out.println("Before swapping a: "+a+", b: "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a: "+a+", b: "+b);
	}
	
	// Swap two numbers without using third variable
	public static void swapTwoNumbers2(int a, int b) {
		System.out.println("Before swapping a: "+a+", b: "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Before swapping a: "+a+", b: "+b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number");
		int b = scanner.nextInt();
		
		System.out.println("Swap two numbers using third variable");
		swapTwoNumbers1(a, b);
		
		System.out.println("Swap two numbers without using third variable");
		swapTwoNumbers1(a, b);
		
	}
}
