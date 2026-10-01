package com.automation.Tests;

public class OccuranceOfCharWithoutUsingLoops {
	
	    public static void main(String[] args) {
	        String inputStr = "Java Programming Language";
	        char targetChar = 'a';
	        
	        String charStr = new String(String.valueOf(targetChar));
	        int numberOfOccurances = inputStr.length() - inputStr.replace(charStr, "").length();
	        System.out.println("occurance of "+targetChar+":"+numberOfOccurances);

	    }
	}

