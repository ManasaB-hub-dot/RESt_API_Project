package com.java.selenium.All_Programs;

import java.util.HashMap;
import java.util.Map;

public class O_Most_Repetitive_Char_In_String {
	
	public static void main(String[] args) {
		
		String input = "Java Selenium Python Selenium";
		
		char[] chars = input.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		
		for(char ch : chars) {
			
			if(ch==' '|| ch=='\n'||ch=='\r') {
				
				continue;
			}
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);			
		}
		
		int maxCount = 0;
		char maxChar = '\0';
		
		for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
			
			
			
			if(entry.getValue()>maxCount) {
				
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
			
			
		}
		
		System.out.println(maxChar+":"+maxCount);
	}

}
