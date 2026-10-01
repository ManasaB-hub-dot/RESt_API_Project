package com.chatGPT;

import java.util.LinkedHashMap;
import java.util.Map;

public class A_First_Non_Repeated_Char_In_String {
	
	public static void main(String[] args) {
		
		String input = "anagramm";
		
		char[] chars = input.toCharArray();
		
		Map<Character,Integer> charMap = new LinkedHashMap<>();
		
		for(char ch : chars) {
			
			if(ch==' '||ch=='\n'||ch=='\r') {
				continue;
			}
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
		}
		
		
		for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
			
		if(entry.getValue()==1) {
			
			System.out.println("first non repeated char - "+entry.getKey()+ ":"+entry.getValue());
			break;
		}
		}				
	}
			
	}
	



		
		
	

