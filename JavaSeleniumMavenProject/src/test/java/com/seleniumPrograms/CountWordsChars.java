package com.seleniumPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordsChars {
	
	public static void countWords(String sentence) {
		
		String cleanText = sentence.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", " ");
		String[] words = cleanText.split("\\s+");
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		for(String word : words) {
			if(!word.isEmpty()) {
				wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	
	public static void countChars(String sentence) {
		
		char[] chars = sentence.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char ch : chars) {
			if(ch==' '||ch=='\n'||ch=='\r') {
				continue;
			}
			
			charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
