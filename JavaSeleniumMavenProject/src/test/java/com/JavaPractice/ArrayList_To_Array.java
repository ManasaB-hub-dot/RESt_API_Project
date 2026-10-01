package com.JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_To_Array {
	
	public static void main(String[] args) {
		
		List<String> arrlist = new ArrayList<>(Arrays.asList("manasa","suresh"));
		
		String[] arr = arrlist.toArray(new String[0]);
		
		for(String str : arr) {
			
			System.out.println(str);
		}
		
		
	}

}
