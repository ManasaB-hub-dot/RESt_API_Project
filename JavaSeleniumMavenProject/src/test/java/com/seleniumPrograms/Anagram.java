package com.seleniumPrograms;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagramCheck(String str1, String str2) {
		
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		
		
		return Arrays.equals(str1Chars, str2Chars);
		
	}
	
	public static void main(String[] args) {
		
		String input1 = "Silent";
		String input2 = "listen";
		
		if(anagramCheck(input1,input2)) {
			System.out.println(input1+" and "+input2+" are anagrams");
		}
		
		else {
			System.out.println(input1+" and "+input2+" are NOT anagrams");
		}
	}

}
