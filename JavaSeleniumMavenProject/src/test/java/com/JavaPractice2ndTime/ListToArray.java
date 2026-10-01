package com.JavaPractice2ndTime;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("manasa","suresh");
		
		String str = String.join("", li);
		
		System.out.println(str);
		
		
	}
}
