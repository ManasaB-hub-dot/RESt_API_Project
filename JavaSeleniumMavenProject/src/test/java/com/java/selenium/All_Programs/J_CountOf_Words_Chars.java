package com.java.selenium.All_Programs;

import java.util.HashMap;
import java.util.Map;

public class J_CountOf_Words_Chars {

	public static void charCount(String input) {

		if (input == null || input.length() == 0 || input.isEmpty() || input.isBlank()) {

			System.out.println("empty string given");
		}

		char[] chars = input.toCharArray();

		Map<Character, Integer> charMap = new HashMap<>();

		for (char ch : chars) {

			if (ch == '\n' || ch == '\r' || ch == ' ') {
				
				continue;
			}

			charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	public static void wordCount(String input) {

		if (input == null || input.length() == 0 || input.isEmpty() || input.isBlank()) {

			System.out.println("empty string given");
		}
		
		String[] words = input.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s");
		
		Map<String,Integer> wordMap = new HashMap<>();
		
		for(String word : words) {
			
			wordMap.put(word, wordMap.getOrDefault(word,0)+1);
		}
		
		for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		String text = "Java selenium python selenium";
		
		charCount(text);
		wordCount(text);
	}

}
