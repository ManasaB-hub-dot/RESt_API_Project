package com.JavaPractice;

public class ReverseSentence {
	
	public static String sentenseReverse(String sentense) {
		
		if(sentense==null ||sentense.length()==0) {
			return sentense;
		}
		
		String[] words = sentense.split("\\s");
		
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			
			result.append(words[i]);
			
			if(i>0) {
				
				result.append(" ");
			}
		}
		
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		
		String input = "Suresh Manasa Narsi Krishan";
		
		String output = sentenseReverse(input);
		
		System.out.println(input);
		System.out.println(output);
	}

}
