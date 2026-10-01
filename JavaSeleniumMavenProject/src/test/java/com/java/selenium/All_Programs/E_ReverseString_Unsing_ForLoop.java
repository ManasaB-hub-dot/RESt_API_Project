package com.java.selenium.All_Programs;

public class E_ReverseString_Unsing_ForLoop {
	
	public static void main(String[] args) {
		
		String input = "Java";
		
		char[] chars = input.toCharArray();
		
		StringBuilder result = new StringBuilder();
		
		for(int i=chars.length-1;i>=0;i--) {
									
			String output = new String(String.valueOf(chars[i]));	
			
			result.append(output);
					
		}
		
		System.out.println(new String(result));
		
	}

}
