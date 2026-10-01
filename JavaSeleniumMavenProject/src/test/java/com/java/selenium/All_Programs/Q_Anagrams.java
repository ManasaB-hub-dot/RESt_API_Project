package com.java.selenium.All_Programs;

import java.util.Arrays;

public class Q_Anagrams {
	
	public static void main(String[] args) {
		
		String s1 = "Cat";
		String s2 = "Act";
		
		String S1Lower = s1.toLowerCase();
		String s2Lower = s2.toLowerCase();
		
		char[] s1Chars = S1Lower.toCharArray();
		char[] s2Chars = s2Lower.toCharArray();
		
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		
		if(Arrays.equals(s1Chars, s2Chars)) {
			System.out.println("Yes");
		}
		else {
			
			System.out.println("No");
		}				
			
	}

}
