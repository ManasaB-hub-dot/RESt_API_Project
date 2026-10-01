package com.javaPrograms;

public class StartingEndingLettersToSmallMiddleLettersToCapital_InGivenString {
			
		public static void main(String[] args) {
			
			String input = "python";
			
			String middleLetters = "";
			
			String mid = "";
			
			char firstChar = input.charAt(0);
			
			String firstLetter = new String(String.valueOf(firstChar)).toLowerCase();
			
			
			char lastChar = input.charAt(input.length()-1);
			
			String lastLetter = new String(String.valueOf(lastChar)).toLowerCase();
			
			
			for(int i=1;i<input.length()-1;i++) {
				
				char middleChar = input.charAt(i);
				
				middleLetters = new String(String.valueOf(middleChar)).toUpperCase();
				
				mid+=middleLetters;		
				
				
			}
			String output = firstLetter+mid+lastLetter;
			
			//System.out.println(firstLetter);
			//System.out.println(lastLetter);
			//System.out.println(mid);
			System.out.println(output);
			
		}

	}



