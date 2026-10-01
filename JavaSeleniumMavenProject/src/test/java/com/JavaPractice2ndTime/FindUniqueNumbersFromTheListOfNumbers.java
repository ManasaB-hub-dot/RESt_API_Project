package com.JavaPractice2ndTime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueNumbersFromTheListOfNumbers {
	
	public static void main(String[] args) {
	
	List<Integer> numbers = Arrays.asList(10,30,60,10,20,20,50);
	
	Set<Integer> uniques = new HashSet<>(numbers);
	
	System.out.println(uniques);
}
}
