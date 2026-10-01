package com.JavaPractice2ndTime;

import java.util.HashMap;
import java.util.Map;

public class WordCharOccurances {
	
	public static void charOccur(String input) {
		
		String cleanText = input.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		char[] chars = cleanText.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<>();
		
		for(char ch : chars ) {
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
		}
		
		System.out.println("Each character occurances ");
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {			
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
//			if(entry.getValue()==1) {
//				
//				System.out.println("Unique chars are : "+entry.getKey());
//				
//			}
//			
//			if(entry.getValue()>1) {
//				
//				System.out.println("duplicate chars are : "+entry.getKey());
//				
//			}
		}
	}
	
	public static void main(String[] args) {
		
		String  str = "Java is very interesting";
		charOccur(str);
		
	}

}
