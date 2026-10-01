package com.JavaPractice;

public class StringLength_Without_Length_menthod {
	
	public static void main(String[] args) {
		
		String input = "manasa";
		
		int len = 0;
		
		for(char ch :input.toCharArray() ) {
			len++;
		}
		
		System.out.println(len);
	}

}
