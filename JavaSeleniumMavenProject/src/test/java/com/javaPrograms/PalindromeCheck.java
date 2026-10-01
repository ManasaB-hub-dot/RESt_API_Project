package com.javaPrograms;

import java.util.Arrays;

public class PalindromeCheck {

	public static boolean checkPalindrome(String input1) {
		
		if(input1==null||input1.length()==0) {
			return false;
		}
		
		String reverse = "";
		for(int i=input1.length()-1;i>=0;i--) {
			reverse+=input1.charAt(i);
		}
		
		char[] input1Chars = input1.toCharArray();
		char[] reverseChars = reverse.toCharArray();
		
		return Arrays.equals(reverseChars, input1Chars);
	}


	public static void main(String[] args) {
		
		String str1 = "radar";
		
		if(checkPalindrome(str1)) {
			System.out.println("Yes Palindrome");
		}
		else {
			System.out.println("No ");
		}
	}

}