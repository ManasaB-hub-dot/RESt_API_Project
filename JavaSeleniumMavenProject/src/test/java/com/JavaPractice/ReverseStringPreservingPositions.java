package com.JavaPractice;

public class ReverseStringPreservingPositions {
	
	public static String reversePreservingSpaces(String input) {
		
		if(input== null) {
			
			return null;
		}
		
		char[] inputChars = input.toCharArray();
		
		char[] result = new char[inputChars.length];
		
		for(int i=0;i<inputChars.length;i++) {
			
			if(inputChars[i]==' ') {
				
				result[i] = ' ';
			}
		}
		
		int j=inputChars.length-1;
		
		for(int i=0;i<inputChars.length;i++) {
			
			if(inputChars[i]!=' ') {
				
				while(result[j]==' ') {
					j--;
				}
				result[j]=inputChars[i];
				j--;
			}
		}
		
		return new String(result);
		
	}
	
	public static void main(String[] args) {
		
		String text = "Java Is Very Interesting!";
		
		String output = reversePreservingSpaces(text);
		
		System.out.println(output);
		
	}
}
