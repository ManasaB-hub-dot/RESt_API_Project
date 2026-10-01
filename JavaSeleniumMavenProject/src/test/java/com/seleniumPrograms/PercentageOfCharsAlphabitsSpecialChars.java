package com.seleniumPrograms;

import java.text.DecimalFormat;

public class PercentageOfCharsAlphabitsSpecialChars {

	public static void percentages(String input) {
		
		if(input.length()==0) {
			
			System.out.println("Empty string is given");
			
			return ;
			
		}
		
		int totalChars = input.length();
		
		double upperCharsCount = 0;
		double lowerCharsCount = 0;
		double digitCount = 0;
		double specialCharsCount = 0;
		
		for(int i=0; i<totalChars;i++) {
			
			char ch = input.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCharsCount++;
			}
			
			else if(Character.isLowerCase(ch)) {
				lowerCharsCount++;
			}
			
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
			else {
				specialCharsCount++;
			}
				
			}
		
			double upperCasePercent = (upperCharsCount*100)/totalChars;
			double lowerCasePercent = (lowerCharsCount*100)/totalChars;
			double digitsPercent = (digitCount*100)/totalChars;
			double specialCharsPercent = (specialCharsCount*100)/totalChars;
			
			DecimalFormat formatter = new DecimalFormat("0.00");
			
			System.out.println("Upper case percentage is : "+formatter.format(upperCasePercent));
			System.out.println("Uplower case percentage is : "+formatter.format(lowerCasePercent));
			System.out.println("digits percentage is : "+formatter.format(digitsPercent));
			System.out.println(" specialChars percentage is : "+formatter.format(specialCharsPercent));
			
		}
	
		public static void main(String[] args) {
		
			String inputStr = "Java 21 is very Awesome & Powerful!";
			percentages(inputStr);
			
		}
	} 

	
	

