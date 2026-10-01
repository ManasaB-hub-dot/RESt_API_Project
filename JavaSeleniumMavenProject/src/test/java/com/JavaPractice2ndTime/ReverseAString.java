package com.JavaPractice2ndTime;

public class ReverseAString {
	
	public static void main(String[] args) {
		
		String name = "ManasA";
		
		String reversed = new StringBuilder(name).reverse().toString();
		
		System.out.println(reversed);
	}

}
