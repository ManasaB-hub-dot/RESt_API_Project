package com.JavaPractice;

public class CharArray_To_String {
	
	public static void main(String[] args) {
		
		String name = "manasa";
		
		char[] chars = name.toCharArray();
		
		String str = new String(chars);
		
		System.out.println(str);
		
		
		String str2 = new String(chars,1,3);
		
		System.out.println(str2);
		
		
	}

}
