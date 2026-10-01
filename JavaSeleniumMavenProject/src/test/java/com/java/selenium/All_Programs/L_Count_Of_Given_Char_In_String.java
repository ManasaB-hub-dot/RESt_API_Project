package com.java.selenium.All_Programs;

public class L_Count_Of_Given_Char_In_String {
	
	public static void main(String[] args) {
		
		String input = "Java";
		
		char targetChar = 'a';
		
		String targetStr = new StringBuilder(String.valueOf(targetChar)).toString();
		
		int charCount = input.length()-input.replace(targetStr, "").length();
		
		System.out.println(charCount);
		
		
	}

}
