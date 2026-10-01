package com.java.selenium.All_Programs;

import java.text.DecimalFormat;

public class C_Find_PercentageOf_UpperCase_LowerCase_Chars {
	
	public static void percentages(String input) {
		
		if(input==null || input.length()==0||input.isBlank()||input.isEmpty()) {
			
			System.out.println("Empty/Blank string is given");
		}
		
		char[] inputChars = input.toCharArray();
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		
		int totalCharsCount = inputChars.length;
		
		for(char ch : inputChars) {
									
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			
			else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
			else {
				specialCharCount++;
			}
			
		}
			
			double upperCaseCountPercent = (upperCaseCount*100)/totalCharsCount;
			double lowerCaseCountPercent = (lowerCaseCount*100)/totalCharsCount;
			double digitCountPercent = (digitCount*100)/totalCharsCount;
			double specialCharCountPercent = (specialCharCount*100)/totalCharsCount;
			
			DecimalFormat formatter = new DecimalFormat("0.00");
			
			System.out.println("Uppercase chars percentage is : "+formatter.format(upperCaseCountPercent)+"("+upperCaseCount+")");
			System.out.println("Lowercase chars percentage is : "+formatter.format(lowerCaseCountPercent)+"("+lowerCaseCount+")");
			System.out.println("Digit chars percentage is : "+formatter.format(digitCountPercent)+"("+digitCount+")");
			System.out.println("Special chars percentage is : "+formatter.format(specialCharCountPercent)+"("+specialCharCount+")");
			
			
		}
		
	
	
	public static void main(String[] args) {
		
		String text = "Java 21 is interesting & Super!";
		
		percentages(text);
		
	}

}
