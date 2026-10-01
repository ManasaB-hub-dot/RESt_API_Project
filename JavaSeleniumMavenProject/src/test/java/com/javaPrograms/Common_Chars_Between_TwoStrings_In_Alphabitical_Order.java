package com.javaPrograms;

import java.util.Set;
import java.util.TreeSet;

public class Common_Chars_Between_TwoStrings_In_Alphabitical_Order {

	public static void main(String[] args) {
		
		String input1 = "Suresh";
		String input2 = "Manasu";
		
		Set<Character> charSet = new TreeSet<>();
		
		
		for(int j=0;j<input1.length();j++) {
			
		 
		 for(int i=0;i<input2.length();i++) {
			 
			 if(input1.charAt(j)==input2.charAt(i)) {
				 
				 charSet.add(input2.charAt(i));
				 
			 }
			 
		 	}
		 
		 
		}
		
		System.out.println(charSet);
		 
	}
}
