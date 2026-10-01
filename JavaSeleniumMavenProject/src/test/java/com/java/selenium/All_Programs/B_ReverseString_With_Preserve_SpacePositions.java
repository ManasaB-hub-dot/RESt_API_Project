package com.java.selenium.All_Programs;

public class B_ReverseString_With_Preserve_SpacePositions {

	public static void main(String[] args) {
		
		String input = "Java is Awesome";
		
		char[] inputChars = input.toCharArray();
		
		char[] duplicate = new char[inputChars.length];
		
		for(int i=0;i<inputChars.length;i++) {
			
			if(inputChars[i]==' ') {
				duplicate[i]=' ';				
			}			
		}		
		
		int j=inputChars.length-1;
		
		for(int i=0;i<inputChars.length;i++) {
			
			if(inputChars[i]!=' ') {
				
				while(duplicate[j]==' ') {
					
					j--;
				}
				
				duplicate[j]=inputChars[i];
				j--;
								
			}						
			
		}
		
		String result = new String(String.valueOf(duplicate)).toString();
		
		System.out.println(result);
	}

}
