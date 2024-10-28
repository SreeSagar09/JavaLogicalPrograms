package com.app.stringprograms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLogicalProgram11 {
	
	// By using Math class max method and Loops.
	public static String findMinLengthString1(String[] input) {
		String result = "";
		int minLength = input[0].length();
		int index = 0;
		
		for(int i=0; i<input.length; i++) {
			if(minLength >= input[i].length()) {
				index = i;
				minLength = Math.min(minLength, input[i].length());
			}
		}
		
		result = input[index];
		return result;
	}
	
	// By using HashMap class and Math class max method.
	public static String findMinLengthString2(String[] input) {
		String result = "";
		int minLength = input[0].length();
		
		Map<Integer, LinkedList<String>> dataMap = new HashMap<>();
		LinkedList<String> inputList = null;
		for(String string : input) {
			if(dataMap.containsKey(string.length())) {
				inputList = dataMap.get(string.length());
				inputList.addLast(string);
				dataMap.replace(string.length(), inputList);
			}else {
				inputList = new LinkedList<>();
				inputList.add(string);
				dataMap.put(string.length(), inputList);
			}
		}
		
		for(Integer integer : dataMap.keySet()) {
			minLength = Math.min(minLength, integer);
		}
		
		result = dataMap.get(minLength).getLast();
		return result;
	}
	
	// By using Stream interface, HashMap class and Math class max method.
	public static String findMinLengthString3(String[] input) {
		String result = "";
		int minLength = input[0].length();

		Stream<String> stream = Stream.of(input);
		Map<Integer, List<String>> dataMap = stream.collect(Collectors.groupingBy(d->d.length(), Collectors.toList()));

		for(Integer integer : dataMap.keySet()) {
			minLength = Math.min(minLength, integer);
		}

		result = dataMap.get(minLength).get(dataMap.get(minLength).size()-1);
		return result;
	}

	public static void main(String[] args) {
		String[] input = { "Blue", "Yellow", "Gray", "Olive Green" };
		
		System.out.println("----- By using Math class max method and Loops ------");
		String result1 = findMinLengthString1(input);
		System.out.println(result1);
		
		System.out.println("---- By using HashMap class and Math class max method ------");
		String result2 = findMinLengthString2(input);
		System.out.println(result2);
		
		System.out.println("----- By using Stream interface, HashMap class and Math class max method -----");
		String result3 = findMinLengthString3(input);
		System.out.println(result3);
	}

}
