package com.JavaPractice2ndTime;

public class ReverseWordByWord {
	
	public static String reverseWords(String text) {
		
		if(text==null) {
			
			return null;
		}
		
		String[] words = text.split(" ");
		
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<words.length;i++) {
			
			
									
			StringBuilder reversed = new StringBuilder();
			
			reversed.append(words[i]).reverse();
			
			result.append(reversed);
			
			if(i>=0) {
			
				result.append(" ");
												
			}
		}
		
		return new String(result);
	}
	
	public static void main(String[] args) {
		
		String input = "Java is Fun";
		
		String output = reverseWords(input);
		
		System.out.println(output);
		
	}

}
