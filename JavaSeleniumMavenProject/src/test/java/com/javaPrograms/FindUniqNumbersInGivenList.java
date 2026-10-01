package com.javaPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqNumbersInGivenList {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,20,30,10,40);
		
		Set<Integer> uniqNum = new HashSet<>();
		
		uniqNum.addAll(nums);
		
		System.out.println(uniqNum);
	}

}
