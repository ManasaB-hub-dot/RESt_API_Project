package com.JavaPractice;

import java.util.Arrays;
import java.util.List;

public class List_To_String {
	
	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("manasa","suresh");
		
		String str = String.join(" ", li);
		
		System.out.println(str);
	}

}
