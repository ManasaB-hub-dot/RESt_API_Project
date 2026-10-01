package com.JavaPractice;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagramCheck(String str1, String str2) {
		
		if(str1==null || str2==null ||str1.length()!=str2.length()) {
			return false;
		}
		
		
		str1 = str1.replaceAll("[^a-zA-Z0-9\\s]", " ").toLowerCase();
		
		str2=str2.replaceAll("[a-zA-Z0-9\\s]", " ").toLowerCase();
		
		char[] str1Chars = str1.toCharArray();
		
		char[] str2Chars = str2.toCharArray();
		
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		
		if(Arrays.equals(str1Chars, str2Chars)) {
			
			return true;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String input1 = "Listen";
		String input2 = "Silent";
		
		if(anagramCheck(input1,input2)) {
			
			System.out.println(input1+" And "+input2+" are Anagrams");
		}
		
		else {
			
			System.out.println(input1+" And "+input2+" are NOT Anagrams");
		}
	}
}
