package com.javaPrograms;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int input = 12345;
		
		int reversed = 0;
		
		String reverseStr = new StringBuilder(String.valueOf(input)).reverse().toString();
		
		int reversedInt = Integer.parseInt(reverseStr);
		
		System.out.println(reversedInt);
	}
	
}
		
		
		
		
		
		
	


