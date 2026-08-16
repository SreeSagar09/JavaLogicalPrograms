package com.app.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class StringLogicalProgram15 {
	
	public static String getLongestNonRepeatingSubString(String input) {
		Map<Character, Integer> indexMap = new HashMap<>();
		
		int left = 0;
		int maxLength = 0;
		int maxStart = 0;
		
		for(int right=0; right<input.length(); right++) {
			char c = input.charAt(right);
			
			if(indexMap.containsKey(c) && indexMap.get(c) >= left) {
				left = indexMap.get(c)+1;
			}
			
			indexMap.put(c, right);
			
			if(right-left+1 > maxLength) {
				maxLength = right-left+1;
				maxStart = left;
			}
		}
		
		return input.substring(maxStart, maxStart+maxLength);
	}
	
	public static void main(String[] args) {
		String input = "abcadeab";
		
		String result = getLongestNonRepeatingSubString(input);
		
		System.out.println("Original string: "+input);
		System.out.println("Longest non pepeating sub string: "+result);
	}
}
