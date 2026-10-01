package com.seleniumPrograms;

class countOfCharInGivenStringWithoutUsingAnyLoop {
	
	public static void main(String[] args) {
		
		String inputStr = "Java a is Proramming Language ";
		char targetChar = 'a';
		
		String targerStr = String.valueOf(targetChar);
		
		int countOfChar = inputStr.length() - inputStr.replace(targerStr, "").length();
		
		System.out.println(targetChar+":"+countOfChar);
	}
	
	
	
	

}
