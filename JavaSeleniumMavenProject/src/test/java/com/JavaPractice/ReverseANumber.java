package com.JavaPractice;

public class ReverseANumber {
	
	public static void reverseNum(int num) {
		
		if(num == 0) {
			
			return ;
		}
		
		String number = new StringBuilder(String.valueOf(num)).reverse().toString();
		
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		int input = 12345;
		reverseNum(input);
		
	}

}
