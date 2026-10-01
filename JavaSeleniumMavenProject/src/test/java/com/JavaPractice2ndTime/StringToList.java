package com.JavaPractice2ndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToList {
	
	public static void main(String[] args) {
		
		String name = "manasa suresh";
		
		List<String> li = Arrays.asList(name.split("\\s+"));
		
		System.out.println(li);
	}

}
