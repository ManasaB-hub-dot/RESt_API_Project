package com.javaPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOfLineWordsCharsOfTextFile {

	    public static void main(String[] args) {
	    	
	        String filePath = "C:\\Users\\MBUSSA\\OneDrive - Capgemini\\Desktop\\Practice.txt"; 

	        int lineCount = 0;
	        int wordCount = 0;
	        int charCount = 0;

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String currentLine;

	            while ((currentLine = reader.readLine()) != null) {
	                
	                lineCount++;

	                charCount += currentLine.length();
	                
	                if(!currentLine.trim().isEmpty( )) {

	                String[] words = currentLine.trim().split("\\s+");
	                wordCount += words.length;
	                }
	           
	            }

	            System.out.println("Total Lines: " + lineCount);
	            System.out.println("Total Words: " + wordCount);
	            System.out.println("Total Characters: " + charCount);

	        } catch (IOException e) {
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }
	}

