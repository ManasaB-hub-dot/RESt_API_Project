package com.JavaPractice;

public class StartingEndingLettersToCapitalMiddleLettersToSmallInGivenString {
	
	public static void main(String[] args) {
		
		String input = "manasa";
		
		char first = input.charAt(0);
		
		char last = input.charAt(input.length()-1);
		
		
		String firstStr = new String(String.valueOf(first)).toUpperCase();
		
		
		String lastStr = new String(String.valueOf(last)).toUpperCase();
		
		String midStr1 ="";
		//String midStr2 ="";
		
		
		for(int i=1;i<input.length()-1;i++) {
			
			char mid = input.charAt(i);
			
			String midStr2 = new String(String.valueOf(mid)).toLowerCase();
			
			midStr1+=midStr2;

		}
		
		String output = firstStr+midStr1+lastStr;
		
		System.out.println(output);
//		System.out.println(firstStr);
//		System.out.println(lastStr);
//		System.out.println(midStr1);
		
	}

}
