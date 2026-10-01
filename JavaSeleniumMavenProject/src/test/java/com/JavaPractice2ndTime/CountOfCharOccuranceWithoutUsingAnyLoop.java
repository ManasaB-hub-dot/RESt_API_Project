package com.JavaPractice2ndTime;

public class CountOfCharOccuranceWithoutUsingAnyLoop {
	
	public static void main(String[] args) {
		
		String input = "Java is a a very popular";
		char targetChar = 'a';
		
		String targetStr = String.valueOf(targetChar);
		
		int count = input.length() - input.replaceAll(targetStr, "").length();
		System.out.println(count);
	}

}
