package com.java.selenium.All_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class H_Find_Unique_Numbers_In_List {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,10,30,10,20,70,50);
		
		Set<Integer> uniqNumbers = new TreeSet<>(list);
		
		System.out.println(uniqNumbers);
	}

}
