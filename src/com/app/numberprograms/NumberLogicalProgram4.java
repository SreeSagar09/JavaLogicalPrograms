package com.app.numberprograms;

import java.util.Scanner;

public class NumberLogicalProgram4 {
	
	// By using Loops
	public static void fibonacciSeries1(int length) {
		int number1 = 0;
		int number2 = 1;

		if(length > 2) {
			System.out.print(number1+", ");
			System.out.print(number2+", ");
			for(int i=0; i<length-2; i++) {
				int temp = number1+number2;
				number1 = number2;
				number2 = temp;
				
				if(i == (length-3)) {
					System.out.println(number2);
				}else {
					System.out.print(number2+", ");
				}
			}
		}else {
			System.out.print(number1+", ");
			System.out.print(number2+", ");
		}
	}
	
	// By using recursive method
	public static void fibonacciSeries2(int length) {
		int number1 = 0;
		int number2 = 1;
		
		if(length > 2) {
			System.out.print(number1+", ");
			System.out.print(number2+", ");
			
			length = length-2;
			generateFobonacciSeries(number1, number2, length);
		}else {
			System.out.print(number1+", ");
			System.out.print(number2+", ");
		}
		
	}
	
	public static void generateFobonacciSeries(int number1, int number2, int length) {
		if(length>0) {
			int temp = number1+number2;
			number1 = number2;
			number2 = temp;
			
			length = length-1;
			if(length<=0) {
				System.out.println(number2);
			}else {
				System.out.print(number2+", ");
			}
			generateFobonacciSeries(number1, number2, length);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter length");
		int input = scanner.nextInt();
		
		System.out.println("By using Loops");
		fibonacciSeries1(input);
		
		System.out.println("By using recursive method");
		fibonacciSeries2(input);
	}

}
