package com.app.stringprograms;

public class StringLogicalProgram16 {
	
	public static String getLongestConsecutiveRepeatingSubString(String input) {
		if(input == null || input.trim().isEmpty()) {
			return "";
		}
		
		int left = 0;
		int maxStart = 0;
		int maxLength = 1;
		int currentLength = 1;
		
		for(int right=1; right<input.length(); right++) {
			if(input.charAt(right) == input.charAt(right-1)) {
				currentLength++;
			}else {
				left = right;
				currentLength = 1;
			}
			
			if(currentLength > maxLength) {
				maxLength = currentLength;
				maxStart = left;
			}
		}
		
		return input.substring(maxStart, maxStart+maxLength);
	}
	
	public static void main(String[] args) {
		String input = "aabbbccccaa";
		
		String result = getLongestConsecutiveRepeatingSubString(input);
		
		System.out.println("Original string: "+input);
		System.out.println("Longest consecutive repeating sub string: "+result);
	}
}
