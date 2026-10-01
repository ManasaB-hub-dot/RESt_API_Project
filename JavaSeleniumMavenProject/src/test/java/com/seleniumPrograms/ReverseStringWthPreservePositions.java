package com.seleniumPrograms;

public class ReverseStringWthPreservePositions {
	
	public static String reversePositions(String input) {
		
		if(input==null) {
			return null;
		}
		
		char[] inputChars = input.toCharArray();
		char[] resultChars = new char[inputChars.length];
		
		for(int i=0;i<inputChars.length;i++) {
			
			if(inputChars[i]==' ') {
				
				resultChars[i] = ' ';
			}
		}
		
		int j=inputChars.length-1;
		
		for(int i=0; i<inputChars.length;i++) {
			
			if(inputChars[i]!=' ') {
				
				while(resultChars[j]==' ') {
					j--;
				
				}
				
				resultChars[j] = inputChars[i];
				j--;
				
			}
			
			
		}
		
		return new String(resultChars);
	}
	
	public static void main(String[] args) {
		
		String input = "Java is interesting";
		String output = reversePositions(input);
		
		System.out.println(input);
		System.out.println(output);
		
		
	}

}
