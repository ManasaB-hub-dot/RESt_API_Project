package com.JavaPractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountOfLinesWordsCharsInTextFile {
	
	public static void main(String[] args) {
	
		String filePath = "C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Desktop\\Practice.txt"; 
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		try {
		
		BufferedReader read = new BufferedReader(new FileReader(filePath));
		
		String currentLine;
		
		while((currentLine = read.readLine())!=null ) {
			
			lineCount++;
			
			charCount+=currentLine.length();
			
			String[] words = currentLine.trim().split("\\s");
			
			for(String word : words) {
				
				if(!word.isEmpty()) {
					
					wordCount++;
				}				
		     }
			
			}	
		
        System.out.println("Total Lines: " + lineCount);
        System.out.println("Total Words: " + wordCount);
        System.out.println("Total Characters: " + charCount);			
		
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
