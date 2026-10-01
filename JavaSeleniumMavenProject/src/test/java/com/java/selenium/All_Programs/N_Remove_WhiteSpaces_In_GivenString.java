package com.java.selenium.All_Programs;

public class N_Remove_WhiteSpaces_In_GivenString {
	
	public static void removeAllWhiteSpaces(String input) {
		
		String output = input.replaceAll("\\s+", "");
		
		System.out.println(output);
		
	}
	
	public static void removeAllSpecialChars(String input) {
		
		String output = input.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		System.out.println(output);
		
	}

	public static void removeAllWhiteSpaces_And_SpeacialChars(String input) {
		
		String output = input.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(output);
	
	}
	
	public static void main(String[] args) {
		
		String input1 = "Ja va \n - s e  l  e ni \r um";
		
		String input2 = "Java!- seleni@um";
		
		String input3 = "Ja va ! - s @ e  l ! e ni @ um";
		
		removeAllWhiteSpaces(input1);
		
		removeAllSpecialChars(input2);
		
		removeAllWhiteSpaces_And_SpeacialChars(input3);
		
		//System.out.println(output);
	}

}
