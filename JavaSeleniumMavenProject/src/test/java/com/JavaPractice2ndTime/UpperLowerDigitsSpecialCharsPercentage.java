package com.JavaPractice2ndTime;

import java.text.DecimalFormat;

public class UpperLowerDigitsSpecialCharsPercentage {
	
	public static void percentages(String text) {
		
		if(text.isEmpty()|| text.length()==0) {
			
			System.out.println("Empty string given");
		}
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitsCount = 0;
		int specialCharCount = 0;
		
		char[] chars = text.toCharArray();
		
		int totalCharCount = chars.length;
		
		for(char ch:chars) {
		
		if(Character.isUpperCase(ch)) {
			
			upperCaseCount++;
		
		}
		
		else if(Character.isLowerCase(ch)) {
			
			lowerCaseCount++;
		}
		
		else if(Character.isDigit(ch)) {
			digitsCount++;
		}
		
		else {
			
			specialCharCount++;
		}
		
		}
		
		double upperCasePercentage = (upperCaseCount*100)/totalCharCount;
		double lowerCasePercentage = (lowerCaseCount*100)/totalCharCount;
		double digitsPercentage = (digitsCount*100)/totalCharCount;
		double specialCasePercentage = (specialCharCount*100)/totalCharCount;
		
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("Upper case percentage is : "+formatter.format(upperCasePercentage)+"("+upperCaseCount+")");
		System.out.println("lower case percentage is : "+formatter.format(lowerCasePercentage)+"("+lowerCaseCount+")");
		System.out.println("digits percentage is : "+formatter.format(digitsPercentage)+"("+digitsCount+")");
		System.out.println("special case percentage is : "+formatter.format(specialCasePercentage)+"("+specialCharCount+")");
		
	} 

	public static void main(String[] args) {
		
		String input = "Java 21 Is Awesome & Very Interesting!";
		percentages(input);
		
		
	}
}
