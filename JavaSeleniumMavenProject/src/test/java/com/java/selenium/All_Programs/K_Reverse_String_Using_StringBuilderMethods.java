package com.java.selenium.All_Programs;

public class K_Reverse_String_Using_StringBuilderMethods {
	
	public static void main(String[] args) {
		
		String input = "Java";
		
		String out = new StringBuilder(input).reverse().toString();
		
		System.out.println(out);
	}

}
