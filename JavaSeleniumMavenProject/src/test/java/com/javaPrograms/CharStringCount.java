package com.javaPrograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class CharStringCount {
	
	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		
//		try {
//			
//			driver.get("https://testautomationpractice.blogspot.com/");
//			
//			WebElement textBlock = driver.findElement(By.xpath("//h3//a[text()='Data Entry Form']"));
//			
//			Wait<WebDriver> fw = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(6)).ignoring(Exception.class);
//			fw.until(ExpectedConditions.visibilityOf(textBlock));
//					
//			String text = textBlock.getText();
//			System.out.println(text);
		String text = "Java selenium python selenium";
			charOcuurances(text);
			stringOccurances(text);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}	
//		
//		finally {
//			driver.close();
//		}
	}
	
	public static void charOcuurances(String text) {
		System.out.println("\n charecter occurances");
		Map<Character,Integer> charMap = new HashMap<>();
		for(char ch : text.toCharArray()) {
			if(ch==' '||ch=='\n'||ch=='\r') {
				continue;
			}
			charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
			}
		for(Map.Entry<Character, Integer> entry :charMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	public static void stringOccurances(String text) {
		System.out.println("\n word occurances");
		String cleanText = text.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", " ");
		String[] words = cleanText.split("\\s+");
		Map<String,Integer> wordMap = new HashMap<>();
		for(String word :words) {
			if(!word.isEmpty()) {
				wordMap.put(word, wordMap.getOrDefault(word,0)+1);
			}
			
			}
		for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
