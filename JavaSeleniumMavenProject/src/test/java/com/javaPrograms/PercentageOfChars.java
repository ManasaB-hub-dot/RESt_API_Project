package com.javaPrograms;

import java.text.DecimalFormat;

public class PercentageOfChars {

	public static void findPercentages(String sentence) {
		
		if(sentence.length()==0) {
			System.out.println("Given string is empty");
			return ;
		}
		
		int totalCharsCount = sentence.length();
		
		int uppercaseCount = 0;
		int lowerCaseCount = 0;
		int digiCount = 0;
		int specialCharsCount = 0;
		
		for(int i=0; i<totalCharsCount;i++) {
			
			char ch = sentence.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				uppercaseCount++;
			}
			
			else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;	
			}
			else if(Character.isDigit(ch)) {
				digiCount++;
			}
			else {
				specialCharsCount++;
			}
			

		}
		
		double uppercaseCountPercentage = (uppercaseCount*100)/totalCharsCount;
		double lowerCaseCountPercentage = (lowerCaseCount*100)/totalCharsCount;
		double digiCountPercentage = (digiCount*100)/totalCharsCount;
		double specialCharsCountPercentage = (specialCharsCount*100)/totalCharsCount;
		
		DecimalFormat formatter = new DecimalFormat("0.00");
		
		System.out.println("Total no.of digits : "+totalCharsCount);
		System.out.println("percentage of upper case chars : "+formatter.format(uppercaseCountPercentage)+"("+uppercaseCount+")");
		System.out.println("percentage of lower case chars : "+formatter.format(lowerCaseCountPercentage)+"("+lowerCaseCount+")");
		System.out.println("percentage of digit chars : "+formatter.format(digiCountPercentage)+"("+digiCount+")");
		System.out.println("percentage of special case chars : "+formatter.format(specialCharsCountPercentage)+"("+specialCharsCount+")");		
		
		}
	
	public static void main(String[] args) {
		
		String input = "Java 21 is very Awesome & Powerful!";
		findPercentages(input);
	}
		
		
	}
	


//Get the total length of the input string
//Handle the case where the string is empty to prevent division by zero
//Initialize counters for each character type
//Iterate through each character of the string
//Check and increment the respective counter
//Calculate percentages using double division
//Format percentages to 2 decimal places
//Print the final breakdown
