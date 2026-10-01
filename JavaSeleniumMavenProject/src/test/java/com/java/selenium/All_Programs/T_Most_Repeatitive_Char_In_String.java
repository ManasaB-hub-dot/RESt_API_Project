package com.java.selenium.All_Programs;

import java.util.HashMap;
import java.util.Map;

public class T_Most_Repeatitive_Char_In_String {
	
	public static void main(String[] args) {
		
		String input = "anagramm";
		
		char[] chars = input.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<>();
		
		for(char ch : chars) {
			
			if(ch==' '||ch=='\n'||ch=='\r') {
				continue;
			}
			
			charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
		}
		
		int maxValue = 0;
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			//System.out.println(entry.getKey()+":"+entry.getValue());
			
			if(entry.getValue()>maxValue) {
				
				maxValue = entry.getValue();
				
				System.out.println(entry.getKey()+":"+ maxValue);
			}
			
		}		
		
	}

}
