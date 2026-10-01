package com.seleniumPrograms;

public class OneStringIsRotationOfAnother {
	
	public static boolean rotationCheck(String str1, String str2) {
		
		if(str1==null || str2==null || str1.length()!=str2.length()) {
			return false;
		}
		
		if(str1.isEmpty()) {
			return true;
		}
		
		String concatenatedString = str1+str1;
		return concatenatedString.contains(str2);
	}
	
	public static void main(String[] args) {
		
		String input1 = "ABCD";
		String input2 = "CDAB";
		
		if(rotationCheck(input1,input2)) {
			System.out.println(input2+"is the rotation of "+input1);
		}
		
		else {
			System.out.println(input2+"is NOT rotation of "+input1);
		}
	}
	
}
