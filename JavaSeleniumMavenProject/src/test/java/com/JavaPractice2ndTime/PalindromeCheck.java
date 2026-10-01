package com.JavaPractice2ndTime;

import java.util.Arrays;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		String str1 = "radar";
		
		String str2 = "";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			str2=str2+str1.charAt(i);
		}
		
		System.out.println("String1 is : "+str1);
		
		System.out.println("String2 is : "+str2);
		
		char[] chars1 = str1.toCharArray();
		
		char[] chars2 = str2.toCharArray();
		
		if(Arrays.equals(chars1, chars2)) {
			
			System.out.println("Yes palindrome");
		}
		
		else {
			
			System.out.println("NO");
		}
	}

}
