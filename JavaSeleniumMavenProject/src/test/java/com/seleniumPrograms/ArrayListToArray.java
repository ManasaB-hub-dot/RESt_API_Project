package com.seleniumPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>(Arrays.asList("manasa","suresh"));
		
		String[] arr = li.toArray(new String[0]);
		
		System.out.println(arr);
	}

}
