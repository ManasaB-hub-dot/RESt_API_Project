package com.JavaPractice2ndTime;

public class ReverseStringUsingForLoop {
	
	public static String reversed(String input) {
		
		if(input==null) {
			
			return null;
		}
		
		char[] chars = input.toCharArray();
		
		char[] result = new char[chars.length];
		
		int j= chars.length-1;
		
		for(int i=0;i<chars.length;i++) {
			
			if(j>=0) {
				
				result[j] = chars[i];
				j--;
			}
			
			
		}
		
		return new String(result);
		
	}
	
	public static void main(String[] args) {
		
		String str = "Manasa";
		
		String output = reversed(str);
		
		System.out.println(output);
	}
	
	

}
