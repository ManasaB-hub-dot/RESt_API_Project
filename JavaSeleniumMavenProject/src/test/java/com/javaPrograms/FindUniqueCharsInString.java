package com.javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharsInString {

	public static void main(String[] args) {
		
		String str = "Preparation";
		
		String strCase = str.toLowerCase();
		
		char[] chars = strCase.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char ch:chars) {
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			if(entry.getValue()==1) {
				
				System.out.println(entry.getKey()+" ");
			}
			
			
		}
		
			
		}
	
}
