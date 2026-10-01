package com.java.selenium.All_Programs;

public class A_Reverse_Each_word_In_Given_String {
	
	public static void main(String[] args) {
		
		String input = "Java is Very Awesome";
		
		String[] words = input.split("\\s");		
		
		StringBuilder output = new StringBuilder();
		
		for(String word : words) {
		
			String reverse = new StringBuilder(word).reverse().toString();
			
			output.append(reverse).append(" ");
			
		}
		
		String result = new String(output);
		
		System.out.println(result.trim());
	}
		
}
