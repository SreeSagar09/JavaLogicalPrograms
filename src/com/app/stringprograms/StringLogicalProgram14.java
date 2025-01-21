package com.app.stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringLogicalProgram14 {

	// By using HashMap
	public static char findMinOccurringCharacter(String input) {
		char minOccurringChar = '\0';
		Integer minCount = input.length();
		HashMap<Character, Integer> charOccurenceMap = new HashMap<>();

		input = input.toLowerCase();

		for(int i=0; i<input.length(); i++) {
			char keyChar = input.charAt(i);
			if(charOccurenceMap.containsKey(keyChar)) {
				Integer count = charOccurenceMap.get(keyChar);
				charOccurenceMap.put(keyChar, count+1);
			}else {
				charOccurenceMap.put(keyChar, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> charEntrySet = charOccurenceMap.entrySet();
		for(Map.Entry<Character, Integer> entry : charEntrySet) {
			if(entry.getValue() < minCount) {
				minCount = entry.getValue();       
				minOccurringChar = entry.getKey();
			}
		}

		return minOccurringChar;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String");
		String input = scanner.nextLine();

		char minOccurringCharacter = findMinOccurringCharacter(input);
		System.out.println("-------- By using HashMap --------");
		System.out.println(minOccurringCharacter);
	}

}
