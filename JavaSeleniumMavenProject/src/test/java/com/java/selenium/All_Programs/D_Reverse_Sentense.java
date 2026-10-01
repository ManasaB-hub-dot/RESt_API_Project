package com.java.selenium.All_Programs;

public class D_Reverse_Sentense {
	
	public static String reversedSentense(String input) {
		
		if(input==null || input.length()== 0||input.isBlank()||input.isEmpty()) {
			
			return input;
		}
		
		String[] inputWords = input.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		
		for(int i=inputWords.length-1;i>=0;i--) {						
			
			result.append(inputWords[i]).append(" ");
		}
		
		return new String(result.toString().trim());
	}

	public static void main(String[] args) {
		
		String text = "Java Selenium Python Selenium";
		
		//reversedSentense(text);
		
		System.out.println(reversedSentense(text));
		
		
	}
}
