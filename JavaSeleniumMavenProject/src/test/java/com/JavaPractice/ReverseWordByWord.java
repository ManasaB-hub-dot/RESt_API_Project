package com.JavaPractice;

public class ReverseWordByWord {

	public static String reverseWords(String inputStr) {
		
		if(inputStr==null) {
			
			return null;
		}
		
		String[] words = inputStr.split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		for(String word : words) {
			
			StringBuilder reversed = new StringBuilder();
			
			reversed.append(word);
			
			reversed.reverse();
			
			result.append(reversed);
			
			for(int i=0; i<words.length;i++) {
				
				if(i>0) {
					
					result.append(" ");
				}
				
			}
			
		}
		
		return result.toString();
		
		}
	
	public static void main(String[] args) {
		
		String text = "Manasa Suresh";
		
		String output = reverseWords(text);
		
		System.out.println(output);
	}
		
	}
	
