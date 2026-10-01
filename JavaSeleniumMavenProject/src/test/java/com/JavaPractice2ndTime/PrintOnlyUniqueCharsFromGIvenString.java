package com.JavaPractice2ndTime;

import java.util.HashMap;
import java.util.Map;

public class PrintOnlyUniqueCharsFromGIvenString {
	
	public static void charOccurances(String text) {
		
		char[] chars = text.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char ch : chars) {
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			if(entry.getValue()==1) {
				
				System.out.println(entry.getKey());
				
				//System.out.println(entry.getKey()+":"+entry.getValue());
				
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String input = "Java is very powerful";
		
		charOccurances(input);
	}


}
