package com.java.selenium.All_Programs;

public class W_StartingEndingLetters_To_Capital_Middle_Letters_To_Small_2nd_Approach {
	
	public static void main(String[] args) {
		
		String input = "manasa";
		
		char first = input.charAt(0);
		
		char last = input.charAt(input.length()-1);
		
		String firstLetter = new String(String.valueOf(first)).toUpperCase();
		
		String lastLetter = new String(String.valueOf(last)).toUpperCase();
		
		char[] chars = input.toCharArray();
		
		String output = "";
		
		for(int i=1;i<chars.length-1;i++) {
			
			String mid = new String(String.valueOf(chars[i])).toLowerCase();
			
			output += mid;		
			
		}
		
		String result = firstLetter+output+lastLetter;
		
		System.out.println(result);
	}

}
