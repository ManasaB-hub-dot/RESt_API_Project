package com.JavaPractice2ndTime;

public class RemoveWhiteSpacesInGivenString {
	
	public static void main(String[] args) {
		
		String input = "Ja v a \n i s \r ve ry p o w e r Full";
		
		String output = input.replaceAll("\\s+", "");
				
		System.out.println(output);
	}

}
