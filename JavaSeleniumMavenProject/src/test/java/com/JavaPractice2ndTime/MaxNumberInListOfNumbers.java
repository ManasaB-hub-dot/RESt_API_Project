package com.JavaPractice2ndTime;

import java.util.List;

public class MaxNumberInListOfNumbers {
	
	public static void main(String[] args) {
	
	int[] numbers = {10,30,20,50};
	
	int max = numbers[0];
	
	int len = numbers.length;
	
	for(int i=1;i<len;i++) {
		
		if(numbers[i]>max) {
			max=numbers[i];
		}
	}
	System.out.println(max);
	
	
	}
	
}
