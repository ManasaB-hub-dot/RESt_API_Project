package com.java.selenium.All_Programs;

public class X_StartingEndingLetters_To_Capital_Middle_Letters_To_Small_In_AllWords {
	
	public static void main(String[] args) {
		
		String input = "manasa suresh narsi krish";
		
		String[] words = input.split("\\s");
		
		String wordResult = "";
	
		StringBuilder result = new StringBuilder();
		
		
		
		for(String word : words) {
			
			char first = word.charAt(0);
			
			String firstLetter = new String(String.valueOf(first)).toUpperCase();
			
			char last = word.charAt(word.length()-1);
			
			String lastLetter = new String(String.valueOf(last)).toUpperCase();
			
			String output = "";						
			
			char[] chars = word.toCharArray();
			
			for(int i=1;i<chars.length-1;i++) {
				
				String mid = new String(String.valueOf(chars[i])).toLowerCase();
				
				output+=mid;
				
			}
			
			wordResult = firstLetter+output+lastLetter;
			
			//System.out.println(wordResult);					
			
			result.append(wordResult).append(" ");
		}
				
		
		String finalResult = new String(result);
		
		System.out.println(finalResult.trim());
		
		
	}

}
