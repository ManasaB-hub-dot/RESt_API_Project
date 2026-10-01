package com.seleniumPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String[] names = {"manasa","suresh"};
		
		List<String> li = new ArrayList<>(Arrays.asList(names));
		
		System.out.println(li);
	}

}
