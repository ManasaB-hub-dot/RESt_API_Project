package com.JavaPractice;

import java.util.ArrayList;
import java.util.List;

public class StartingEndingLetterToCapital_MiddleLettersToSmall_InAllWords_OfGivenString {

	public static void main(String[] args) {

		String input = "Java Python SQL";		
		
		String firstLetter = "";
						
		String lastLetter ="";		
		
		List<String> list = new ArrayList<>();

		String finalStr = "";

		String[] words = input.split(" ");
				
		for (int i = 0; i < words.length; i++) {
			
			String concat ="";
			
			String midLetters = "";			
			
			char first = words[i].charAt(0);

			firstLetter = new String(String.valueOf(first)).toUpperCase();			

			char last = words[i].charAt(words[i].length() - 1);

			lastLetter = new String(String.valueOf(last)).toUpperCase();
			
				for (int j = 1; j < words[i].length() - 1; j++) {
	
					char mid = words[i].charAt(j);
	
					String midStr = new String(String.valueOf(mid)).toLowerCase();	
					
					midLetters += midStr;															
			}	
			
			concat = firstLetter+midLetters+lastLetter;
			
			list.add(concat);
			list.add(" ");
												
		}		

		String output = String.join(" ", list);

		System.out.println(output);

	}

}
