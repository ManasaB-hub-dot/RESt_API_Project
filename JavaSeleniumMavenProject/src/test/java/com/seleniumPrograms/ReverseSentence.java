package com.seleniumPrograms;

public class ReverseSentence {
	
	public static String sentenseReverse(String input) {
		
		if(input==null || input.isEmpty()) {
			return null;
		}
		
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			
			result.append(words[i]);
			
			if(i>0) {
				result.append(" ");
			}
			
			
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		
		String str = "Java is very interesting";
		String reversedStr = sentenseReverse(str);
		
		System.out.println(str);
		System.out.println(reversedStr);
		
	}
}
