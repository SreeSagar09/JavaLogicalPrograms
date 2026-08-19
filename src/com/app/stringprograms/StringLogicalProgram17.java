package com.app.stringprograms;

import java.util.ArrayDeque;
import java.util.Stack;

public class StringLogicalProgram17 {
	/* By using Stack class */
	public static boolean hasBalancedBrackets(String input) {
		Stack<Character> stack = new Stack<>();
		char c, l;
		
		for(int i=0; i<input.length(); i++) {
			c = input.charAt(i);
			
			if(c == '[' || c  == '{' || c == '(') {
				stack.push(c);
			}else if(c == ']' || c == '}' || c == ')') {
				l = stack.peek();
				
				if((l == '[' && c == ']') || (l == '{' && c == '}') || (l == '(' && c == ')')) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		
		return stack.empty();
	}
	
	/* By using Stack class */
	public static boolean hasBalancedBrackets2(String input) {
		ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
		char c, l;
		
		for(int i=0; i<input.length(); i++) {
			c = input.charAt(i);
			
			if(c == '[' || c == '{' || c == '(') {
				arrayDeque.offerLast(c);
			}else if(c == ']' || c == '}' || c == ')') {
				l = arrayDeque.peekLast();
				
				if((l == '[' && c == ']') || (l == '{' && c == '}') || (l == '(' && c == ')')) {
					arrayDeque.pollLast();
				}else {
					return false;
				}
			}
		}
		
		return arrayDeque.isEmpty();
	}
	
	public static void main(String[] args) {
		String input = "{Abs23{{Bcd23}(})}}";
		
		System.out.println("------- By using Stack class methods --------");
		boolean hasBalanced = hasBalancedBrackets(input);
		System.out.println(input+" is balanced: "+hasBalanced);
		
		System.out.println("-------- By using ArrayDeque class methods --------");
		boolean hasBalanced2 = hasBalancedBrackets2(input);
		System.out.println(input+" is balanced: "+hasBalanced2);
	}
}
