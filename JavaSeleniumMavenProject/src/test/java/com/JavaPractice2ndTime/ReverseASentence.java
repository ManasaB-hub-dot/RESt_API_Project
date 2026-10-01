package com.JavaPractice2ndTime;

public class ReverseASentence {
	
	public static String sentenceReverse(String input) {
		
		if(input==null||input.isEmpty()) {
			
			return input;
		}
		
		String cleanText = input.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		String[] words = cleanText.split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		
		for(int i=words.length-1;i>=0;i--) {
			
			result.append(words[i]);
			
			if(i>0) {
				
				result.append(" ");
			}
			
		}
		
		return new String(result);
	}
	
	public static void main(String[] args) {
		
		String sentense = "Java is very Awesome";
		
		String output = sentenceReverse(sentense);
		
		System.out.println(sentense);
		
		System.out.println(output);
		
	}

	
}
