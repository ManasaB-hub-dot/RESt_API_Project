package com.java.selenium.All_Programs;

import java.util.Arrays;

public class V_Palindrome {
	
	public static void main(String[] args) {
		
		String input = "radar";
		
		String output = new StringBuilder(input).reverse().toString();
		
		char[] inputChars = input.toCharArray();
		
		char[] outputchars = output.toCharArray();
		
		if(Arrays.equals(inputChars, outputchars)) {
			
			System.out.println("Yes palindrome");
		}
		
		else {
			
			System.out.println("No");
			
		}
		
		
	}

}
