package com.JavaPractice2ndTime;

import java.util.Arrays;

public class AnagramCheck {

	public static boolean checkAnagram(String str1, String str2) {
		
		if(str1.length()==0||str2.length()==0||str1.length()!=str2.length()) {
			
			return false;
		}
		
		str1 = str1.toLowerCase();
		str2 = str1.toLowerCase();
		
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		
		return Arrays.equals(str1Chars, str2Chars);
	}
	
	public static void main(String[] args) {
		
		String input1 = "Silent";
		String input2 = "Listen";
		
		if(checkAnagram(input1, input2)) {
			
			System.out.println("Yes anagrams");
		}
		
		else {
			System.out.println("NO");
		}
	}
}
