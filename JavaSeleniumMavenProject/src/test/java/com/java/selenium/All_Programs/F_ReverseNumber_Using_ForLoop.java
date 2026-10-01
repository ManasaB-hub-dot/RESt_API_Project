package com.java.selenium.All_Programs;

public class F_ReverseNumber_Using_ForLoop {

	public static void main(String[] args) {
		
		int number = 12345;
		
		String numberStr = new StringBuilder(String.valueOf(number)).toString();
		
		StringBuilder result = new StringBuilder();
		
		String str = "";
		
		for(int i=numberStr.length()-1;i>=0;i--) {
			
			result.append(numberStr.charAt(i));
			
		}
		
		result.toString();
		
		str = new String(result);
		
		int reversedNumber = Integer.parseInt(str);
		
		System.out.println(reversedNumber);
	}
}
