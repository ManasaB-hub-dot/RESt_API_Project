package com.JavaPractice;

public class ReverseStringUsingForLoop {
	
	public static void main(String[] args) {
		
		String str = "Manasa";
		String reversed ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}
		
		System.out.println(reversed);
	}

}
