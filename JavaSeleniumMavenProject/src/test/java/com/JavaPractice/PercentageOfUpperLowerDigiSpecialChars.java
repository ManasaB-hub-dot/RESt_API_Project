package com.JavaPractice;

import java.text.DecimalFormat;

public class PercentageOfUpperLowerDigiSpecialChars {
	
	public static void percentages(String input) {
		
		if(input==null||input.length()==0) {
			
			return ;
		}
		
		char[] chars = input.toCharArray();
		int totalCharsLength = chars.length;
		
		int upperCaseCharCount = 0;
		int lowerCaseCharCount = 0;
		int digitCharCount = 0;
		int specialCharCount = 0;
		
		for(char ch : chars) {
			
			if(Character.isUpperCase(ch)) {
				upperCaseCharCount++;
			}
			
			else if(Character.isLowerCase(ch)) {
				lowerCaseCharCount++;
			}
			
			else if(Character.isDigit(ch)) {
				digitCharCount++;
			}
			
			else {
				specialCharCount++;
			}
			
		}
		
		double upperCaseCharPercentage = (upperCaseCharCount*100)/totalCharsLength;
		double lowerCaseCharPercentage = (lowerCaseCharCount*100)/totalCharsLength;
		double digitCharPercentage = (digitCharCount*100)/totalCharsLength;
		double specialCharPercentage = (specialCharCount*100)/totalCharsLength;
		
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("upper case letter percentage is : "+formatter.format(upperCaseCharPercentage)+"("+upperCaseCharCount+")");
		System.out.println("lower case letter percentage is : "+formatter.format(lowerCaseCharPercentage)+"("+lowerCaseCharCount+")");
		System.out.println("digits percentage is : "+formatter.format(digitCharPercentage)+"("+digitCharCount+")");
		System.out.println("special chars percentage is : "+formatter.format(specialCharPercentage)+"("+specialCharCount+")");
	}
	
	public static void main(String[] args) {
		
		String text = "Java 21 Is Very Awesome & Powerful!";
		percentages(text);
	}
	
}
