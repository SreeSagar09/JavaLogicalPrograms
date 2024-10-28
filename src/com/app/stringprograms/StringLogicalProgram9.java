package com.app.stringprograms;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLogicalProgram9 {

	// By using Loops
	public static int findTheOccuranceOfCharacter1(String input, char c) {
		int count = 0;

		if (!input.trim().isEmpty()) {
			input = input.replaceAll("\\s", "");

			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == c) {
					count++;
				}
			}
		}

		return count;
	}

	// By using Stream interface collect and Collectors class groupingBy, counting methods
	public static int findTheOccuranceOfCharacter2(String input, char c) {
		int count = 0;

		if (!input.trim().isEmpty()) {
			input = input.replaceAll("\\s", "");

			Map<String, Long> map = Stream.of(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			Long l = map.containsKey(c+"")?map.get(c+""):0;
			count = l.intValue();
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input string:");
		String input = scanner.nextLine();

		System.out.println("Please enter Character to find ocuurance:");
		char c = scanner.nextLine().charAt(0);

		System.out.println("-------  By using Loops -------");
		int count1 = findTheOccuranceOfCharacter1(input, c);
		System.out.println("Occurance of '" + c + "' is: " + count1);

		System.out.println("--- By using Stream interface collect and Collectors class groupingBy, counting methods ---");
		int count2 = findTheOccuranceOfCharacter2(input, c);
		System.out.println("Occurance of '" + c + "' is: " + count2);
	}

}
