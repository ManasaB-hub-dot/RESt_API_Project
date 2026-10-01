package com.JavaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindUniqueNumbersInList {
		
		public static void uniqNumFinder() {
			
			List<Integer> num = Arrays.asList(10,100, 20, 10, 50, 70, 30, 70);
			
			Set<Integer> uniqNum = new HashSet<>(num);
			
			Set<Integer> uniqNum_ascending = new TreeSet<>(num);
			
			System.out.println(uniqNum);
			
			System.out.println(uniqNum_ascending);
		
	}

	public static void main(String[] args) {
		
		uniqNumFinder();
		
	}
}
