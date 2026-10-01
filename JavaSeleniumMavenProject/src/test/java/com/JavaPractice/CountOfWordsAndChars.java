package com.JavaPractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfWordsAndChars {
	
	public static void wordCount(String text) {
		
		String cleanText = text.replaceAll("[^a-zA-Z0-9\\s]", " ");
		String[] words = cleanText.split("\\s+");
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		for(String word : words) {
			
			if(!word.isEmpty()) {
				
				wordMap.put(word, wordMap.getOrDefault(word,0)+1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : wordMap.entrySet() ) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	
	public static void charCount(String text) {
		
		String cleanText = text.replaceAll("[^a-zA-Z0-9\\s]", " ");
		char[] chars = cleanText.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char ch : chars) {
			
			charMap.put(ch, charMap.getOrDefault(ch,0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement sentence = driver.findElement(By.xpath("//h3//a[text()='Data Entry Form']"));
		
		String input = sentence.getText();
		
		
		System.out.println(input);
		wordCount(input);
		charCount(input);
		
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			
			driver.close();
		}
		
	}
	
}
