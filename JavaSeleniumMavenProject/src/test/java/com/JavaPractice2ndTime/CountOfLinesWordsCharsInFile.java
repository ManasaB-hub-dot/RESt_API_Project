package com.JavaPractice2ndTime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOfLinesWordsCharsInFile {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Desktop\\Practice.txt";
		
		String currentLine="";
		int lineCount =0;
		int wordCount=0;
		int charCount=0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			try {
				while((currentLine=reader.readLine())!=null) {
					lineCount++;
					
					charCount+=currentLine.length();
					
					String[] words = currentLine.trim().split("\\s+");
					wordCount+=words.length;
															
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(lineCount);
		System.out.println(wordCount);
		System.out.println(charCount);
	}
	
	
	
}
