package com.javaPrograms;

public class PrintCapitalLettersAndSmallLetters {
	
	public static void main(String[] args) {
		
		String str = "MaNaSa";
		
		char[] chars = str.toCharArray();
		
		int capitalLetterCount = 0;
		
		int smallLetterCount = 0;
		
		
		for(char ch : chars) {
			
			if(Character.isUpperCase(ch)) {
				
				capitalLetterCount++;
			}
			
			else if(Character.isLowerCase(ch)) {
				
				smallLetterCount++;
			}
				
			}
		
		System.out.println("Capital letter count is : "+capitalLetterCount);
		
		System.out.println("Small letter count is : "+smallLetterCount);
		}
		
		
	}


