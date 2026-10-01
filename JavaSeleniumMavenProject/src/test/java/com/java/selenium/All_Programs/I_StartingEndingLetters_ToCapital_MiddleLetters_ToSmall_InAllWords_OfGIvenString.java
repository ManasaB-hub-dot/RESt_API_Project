package com.java.selenium.All_Programs;

public class I_StartingEndingLetters_ToCapital_MiddleLetters_ToSmall_InAllWords_OfGIvenString {

	public static void changeCases(String input) {

		if (input == null || input.length() == 0 || input.isBlank() || input.isEmpty()) {

			System.out.println("Empty string given");
		}

		String midLetters;

		String concat;

		// String firstStr = new String();
		// String lastStr = new String();
		// String midStr = new String();

		StringBuilder midStr = new StringBuilder();
		
		

		char first = Character.toUpperCase(input.charAt(0));

		String firstLetter = new StringBuilder(String.valueOf(first)).toString().toUpperCase();

		String firstStr = new String(firstLetter);
		

		for (int i = 1; i < input.length() - 1; i++) {

			char middle = Character.toLowerCase(input.charAt(i));

			midLetters = new StringBuilder(String.valueOf(middle)).toString().toLowerCase();

			midStr.append(midLetters);

		}
		
		String midd = new String(midStr);

		

		char last = Character.toUpperCase(input.charAt(input.length() - 1));

		String lastLetter = new StringBuilder(String.valueOf(last)).toString().toUpperCase();

		String lastStr = new String(lastLetter);

		concat = firstStr + midd + lastStr;
		
		System.out.println(concat);

	}

	public static void main(String[] args) {

		String str = "java";

		changeCases(str);
	}
}