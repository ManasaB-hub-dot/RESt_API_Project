package com.JavaPractice;

public class OccuranceOfCharWithoutUsingLoop {
	
	public static boolean targetCharCount(String input) {
		
		if(input==null) {
			
			return false;
		}
		
		char targetChar = 'a';
		
		String target = new StringBuilder(String.valueOf(targetChar)).toString();
		
		int count = input.length() - input.replace(target, "").length();
		
		System.out.println("Count of target char is : "+count);
		
		return false;
	
	}
	
	public static void main(String[] args) {
		
		String input1 = "Java 21 is Awesome";
		
		targetCharCount(input1);
	
	}

}
