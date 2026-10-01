package com.JavaPractice;

public class RemoveWhiteSpaces {
	
	public static String removeWhiteSpaces(String str) {
		
		if(str==null) {
			
			return str;
		}
		
		String strOutput = str.replaceAll("\\s", "").trim();
		//String strOutput = str.trim();
		
		System.out.println(str);
		System.out.println(strOutput);
		
		return strOutput;
	}
	
	public static void main(String[] args) {
		
		String input = "J a va 21 i s ve ry Awe \n \r some!";
		removeWhiteSpaces(input);
	}

}
