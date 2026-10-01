package com.javaPrograms;

import java.util.Arrays;

public class Anagrams {

	public static boolean isAnagram(String str1, String str2) {
		
		str1=str1.replaceAll("\\s","").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		
		return Arrays.equals(str1Chars, str2Chars);
	}
	
	public static void main(String[] args) {
		String str1="Listen";
		String str2="Silent";
		
		if(isAnagram(str1, str2)) {
			System.out.println("\""+str1+"\""+" and "+"\""+str2+"\""+" are anagrams");
		}
		
		else {
			System.out.println("\""+str1+"\""+" and "+"\""+str2+"\""+" are NOT anagrams");
		}
	}
	
}


//public class AnagramSorting {
//    public static boolean isAnagram(String str1, String str2) {
//        // Remove spaces and convert to lowercase for case-insensitive comparison
//        str1 = str1.replaceAll("\\s", "").toLowerCase();
//        str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//        // If lengths are not equal, they cannot be anagrams
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Convert strings to character arrays
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        // Sort both arrays
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//        // Check if sorted arrays are equal
//        return Arrays.equals(charArray1, charArray2);
//    }
//
//    public static void main(String[] args) {
//        String s1 = "Listen";
//        String s2 = "Silent";
//
//        if (isAnagram(s1, s2)) {
//            System.out.println(s1 + " and " + s2 + " are anagrams.");
//        } else {
//            System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
//        }
//    }
//}
//
