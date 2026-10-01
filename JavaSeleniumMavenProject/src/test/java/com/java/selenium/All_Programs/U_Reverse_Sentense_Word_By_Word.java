package com.java.selenium.All_Programs;

public class U_Reverse_Sentense_Word_By_Word {

	public static void main(String[] args) {
		
		String input = "Java is very Awesome";
		
		String[] words = input.split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			
			String output = new StringBuilder(words[i]).reverse().toString();		
			
			result.append(output).append(' ');						
			
		}
		
		String finalOutput = new String(result).trim();
		
		System.out.println(finalOutput);
		
	}
}
