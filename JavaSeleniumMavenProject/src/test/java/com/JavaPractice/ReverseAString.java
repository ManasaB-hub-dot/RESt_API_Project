package com.JavaPractice;

public class ReverseAString {
	
	public static String reverseStr(String input) {
		
		if(input==null) {
			
			return null;
		}
		
		String reversed = new StringBuilder(input).reverse().toString();
		
		System.out.println(reversed);
		
		return reversed;
		
	}
	
	public static void main(String[] args) {
		
		String str = "Manasa";
		
		reverseStr(str);
		
	}

}
