package com.JavaPractice2ndTime;

public class ReverseStringPreserveTheirPositionsOfSpaces {
	
	public static String reversedWithSpacePreserve(String input) {
		
		if(input==null || input.isEmpty()) {
			
			return input;
		}
		
		String cleanText = input.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		char[] chars = cleanText.toCharArray();
		
		char[] result = new char[chars.length];
		
		for(int i=0;i<chars.length;i++) {
			
			if(chars[i]==' ') {
				
				result[i]=' ';
			}
		}
		
		int j=chars.length-1;
		
		for(int i=0;i<chars.length;i++) {
			
			if(chars[i]!=' ') {
				
				while(result[j]==' '){
					j--;
			}
				
				result[j]=chars[i];
				j--;
			}
			
			
		}
		
		return new String(result);
		
	}
	
	public static void main(String[] args) {
		
		String text = "Java is powerful and Interesting";
		
		String output = reversedWithSpacePreserve(text);
		
		System.out.println(text);
		
		System.out.println(output);
		
	}

}
