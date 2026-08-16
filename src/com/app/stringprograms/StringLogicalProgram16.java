package com.app.stringprograms;

public class StringLogicalProgram16 {
	
	public static String getLongestConsecutiveRepeatingSubString(String input) {
		int start = 0;
		int maxStart = 0;
		int maxLength = 1;
		int currentLength = 1;
		
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1)) {
				currentLength++;
			}else {
				start = i;
				currentLength = 1;
			}
			
			if(currentLength > maxLength) {
				maxLength = currentLength;
				maxStart = start;
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
