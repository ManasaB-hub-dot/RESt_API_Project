package com.automation.Tests;

public class StringReverseUsingStringMethods {
	
	public static void main(String[] args) {
		
		String str = "manasa";
		
		String text = new StringBuilder(String.valueOf(str)).reverse().toString();
		
		System.out.println(text);
	}
	
}

