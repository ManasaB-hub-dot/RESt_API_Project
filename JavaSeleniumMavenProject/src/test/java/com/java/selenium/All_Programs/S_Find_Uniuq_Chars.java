package com.java.selenium.All_Programs;

import java.util.HashMap;
import java.util.Map;

public class S_Find_Uniuq_Chars {
	
public static void main(String[] args) {
		
		String input = "Anagramm";
		
		String cleanText = input.toLowerCase();
		
		char[] chars = cleanText.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<>();
		
		for(char ch : chars) {
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
			
			if(entry.getValue()==1) {
				
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
	}

}
