package com.JavaPractice;

import java.util.Arrays;
import java.util.List;

public class Array_To_ArrayList {

	public static void main(String[] args) {
		
		String[] arr = {"manasa","suresh"};
		
		List<String> li = Arrays.asList(arr);
		
		System.out.println(li);
	}
}
