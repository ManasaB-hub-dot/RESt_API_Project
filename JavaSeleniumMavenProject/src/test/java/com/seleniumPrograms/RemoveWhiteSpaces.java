package com.seleniumPrograms;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String inputStr = "J a va is a p r gra \n \r mm i n g Lan gua ge";
		
		String trimStr = inputStr.replaceAll("\\s+", "");
		
		System.out.println(trimStr);
	}

}
