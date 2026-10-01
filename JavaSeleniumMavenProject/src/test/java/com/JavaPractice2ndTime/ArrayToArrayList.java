package com.JavaPractice2ndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String[] arr = {"suresh","manasa"};
		
		List<String> li = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(li);
		
	}

}
