package com.JavaPractice2ndTime;

public class ReverseANumber {
	
	public static void main(String[] args) {
	
	int num = 12345;
	
	String str1 = String.valueOf(num);
	
	char[] chars = str1.toCharArray();
	
	char[] result = new char[chars.length];
	
	int j=chars.length-1;
	
	for(int i=0;i<chars.length;i++) {
		
		result[j] = chars[i];
		j--;
		
	}
	
	System.out.println(new String(result));
	
		
	}

}
