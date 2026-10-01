package com.javaPrograms;

public class RemoveWhiteSpaces {

	
	    public static void main(String[] args) {
	        String str = "  J  a  va \t is \n Fun  ";
	        
	        // \\s matches any whitespace character, replacing it with an empty string
	        String result = str.replaceAll("\\s", "");
	        
	        System.out.println("Original: " + str);
	        System.out.println("Modified: " + result);
	        
	        
	        
//	        String originalString = "J a v a i s \n \t Fun";
//	        
//	        String modifiedString = originalString.replaceAll("\\s", "");
//	        
//	        System.out.println("original string is : "+originalString);
//	        
//	        System.out.println("Modified string is : "+modifiedString);
	        
	        
	        
	    }
	

	
}
