package com.javaPrograms;

public class OneStringIsRotationOfAnother {
	
	public static boolean isRotation(String str1,String str2) {
		
		if(str1==null || str2 ==null || str1.length()!= str2.length() ) {
			return false;
		}
		
		if(str1.isEmpty()) {
			return true;
		}
		
		String concatinatedString = str1+str1;
		
		return concatinatedString.contains(str2);
		
	}
	
	public static void main(String[] args) {
		String str1="ABCD";
		String str2="CDAB";
		
		if(isRotation(str1,str2)) {
			System.out.println(str1+" is the rotaion of "+str2);
		}
		
		else {
			System.out.println(str1+" is \"NOT\" rotaion of "+str2);
		}
	}
}



	    
/*	    // Method to check if str2 is a rotation of str1
	    public static boolean isRotation(String str1, String str2) {
	        // Handle null cases and ensure lengths match
	        if (str1 == null || str2 == null || str1.length() != str2.length()) {
	            return false;
	        }
	        
	        // Handle the case where both strings are empty but identical
	        if (str1.isEmpty()) {
	            return true;
	        }

	        // Concatenate str1 with itself
	        String concatenated = str1 + str1;

	        // Check if str2 is a substring of the concatenated string
	        return concatenated.contains(str2);
	    }

	    public static void main(String[] args) {
	        String str1 = "ABCD";
	        String str2 = "CDAB";

	        if (isRotation(str1, str2)) {
	            System.out.println("\"" + str2 + "\" is a rotation of \"" + str1 + "\"");
	        } else {
	            System.out.println("\"" + str2 + "\" is NOT a rotation of \"" + str1 + "\"");
	        }
	    }
	}*/

	

