package com.java.selenium.All_Programs;

public class G_ReverseWords_AtTheir_SamePosition_InGivenString_UsingForLoop {
	
	public static void main(String[] args) {
		
		String text = "Java Is very Interesting!";
		
		String[] words = text.split("\\s");
		
		StringBuilder reversed = new StringBuilder();
		
		for(String word : words) {
			
			reversed.append(words).reverse();
			
			reversed.append(" ");						
			
		}
		
		reversed.toString().trim();
		
		String output = new String(reversed);
		
		System.out.println(output);		
		
	}

}
