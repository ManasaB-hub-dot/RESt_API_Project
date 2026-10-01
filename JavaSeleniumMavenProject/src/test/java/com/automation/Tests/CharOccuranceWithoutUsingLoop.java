package com.automation.Tests;

public class CharOccuranceWithoutUsingLoop {
	
	public static void main(String[] args) {
		
		String input = "Java is very awesome";
		char targetChar = 'a';
		
		String charStr = String.valueOf(targetChar);
		
		int len = input.length() - input.replace(charStr, "").length();
		System.out.println(targetChar+":"+len);
	}

}
