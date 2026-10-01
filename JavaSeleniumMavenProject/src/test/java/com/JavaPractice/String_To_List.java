package com.JavaPractice;

import java.util.Arrays;
import java.util.List;

public class String_To_List {
	
	public static void main(String[] args) {
		
		String text = "python java selenium";
		
		List<String> li = Arrays.asList(text.split(","));
		
		System.out.println(li);
		
	}

}
