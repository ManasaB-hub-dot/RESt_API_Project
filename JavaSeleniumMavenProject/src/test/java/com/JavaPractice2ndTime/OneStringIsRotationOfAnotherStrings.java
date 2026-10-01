package com.JavaPractice2ndTime;

public class OneStringIsRotationOfAnotherStrings {
	
	public static boolean rotation(String str1, String str2) {
		
		if(str1.length()==0||str2.length()==0||str1.length()!=str2.length()) {
			
			return false;
		}
		
		String newStr = str1.concat(str1);
		
		if(newStr.contains(str2)) {
			
			System.out.println("Yes");
		}
		else {
			
			System.out.println("No");
		}
		
		return true;
		
	} 
	
	public static void main(String[] args) {
		
		String text1 = "ABCD";
		String text2 = "CDAB";
		
		rotation(text1, text2);
	}

}
