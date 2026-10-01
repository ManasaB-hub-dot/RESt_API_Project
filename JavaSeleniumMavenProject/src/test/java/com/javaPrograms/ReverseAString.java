package com.javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String inputStr = "Manasa";
		
		String reversed = new StringBuilder(inputStr).reverse().toString();
		
		System.out.println(reversed);
	}
}
