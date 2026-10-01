package com.javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class StartingEndingLettersToCapitalMiddleLettersToSmall_InAllWords_InGivenString {
	
	public static void main(String[] args) {
		
		String input = "java python javascript";
		
		String[] words = input.split(" ");
		
		
		String firstLetter="";
		
		String lastLetter="";
		
		String output = "";
		
		String concat = "";
		
		List<String> list = new ArrayList<>();
			
		for(int j=0;j<words.length;j++) {
			
			String midLetters = "";
			
			 char first = words[j].charAt(0);
			 
			 firstLetter = new String(String.valueOf(first)).toUpperCase();
			 
			 
			 char last = words[j].charAt(words[j].length()-1);
			 
			 lastLetter = new String(String.valueOf(last)).toUpperCase();
			 
			 
			 for(int i=1;i<words[j].length()-1;i++) {
				 
				 char mid = words[j].charAt(i);
				 
				 String midStr = new String(String.valueOf(mid)).toLowerCase();
				 
				 midLetters+=midStr; 
			
			 }
			 
			 output = firstLetter+midLetters+lastLetter;
			 
			 list.add(output);
			 list.add(" ");
			 
		}
		
					 				 
		String finall  = String.join(" ", list);
		
		String finalOutput = finall.trim();
		
		System.out.println(finalOutput);
	} 
	
}
