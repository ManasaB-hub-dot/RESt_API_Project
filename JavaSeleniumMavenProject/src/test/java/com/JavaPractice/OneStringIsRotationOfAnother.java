package com.JavaPractice;

public class OneStringIsRotationOfAnother {
	
	public static boolean rotationCheck(String str1, String str2) {
		
		if(str1== null || str2 == null ||str1.length()==0) {
			
			return false;
		}
		
		String concate = str1+str1;
		
		if(concate.contains(str2)) {
			
			System.out.println(" Yes "+str2+" is the rotation of "+str1);
		}
		
		else {
			
			System.out.println(" Yes "+str2+" is the NOT rotation of "+str1);
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String input1 = "ABCD";
		String input2 = "CDAB";
		
		rotationCheck(input1, input2);
	}
	
}
