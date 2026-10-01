package com.seleniumPrograms;

public class ReverseStringWordByWord {
	
	public static String reverseWordByWord(String inputStr) {
		
		if(inputStr==null || inputStr.isEmpty()) {
			return inputStr;
		}
		
		String[] inputStrWords = inputStr.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word : inputStrWords) {
			StringBuilder reversedStr = new StringBuilder();
			reversedStr.append(word).reverse().append(" ");
			result.append(reversedStr);
			
		}
		
		return result.toString().trim();
	}
	
	public static void main(String[] args) {
		
		String input = "Java is very Interesting";
		String output = reverseWordByWord(input);
		
		System.out.println(input);
		System.out.println(output);
	}

}
