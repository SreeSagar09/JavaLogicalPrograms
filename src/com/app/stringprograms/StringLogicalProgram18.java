package com.app.stringprograms;

public class StringLogicalProgram18 {
	
	/* To find longest consecutive repeating sub string length */
	public static int getLongestConsecutiveRepeatingSubStringLength(String input) {
		if(input == null || input.trim().isEmpty()) {
			return 0;
		}
		
		int currentLength = 1;
		int maxLength = 1;
		
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1)) {
				currentLength++;
			}else {
				currentLength = 1;
			}
			
			if(currentLength>maxLength) {
				maxLength = currentLength;
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		String input = "aabbbccccaa";
		
		int result = getLongestConsecutiveRepeatingSubStringLength(input);
		
		System.out.println("Original string: "+input);
		System.out.println("Longest consecutive repeating sub string length: "+result);

	}

}
