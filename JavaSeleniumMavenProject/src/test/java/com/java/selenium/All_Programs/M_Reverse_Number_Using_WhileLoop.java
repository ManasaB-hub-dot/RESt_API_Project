package com.java.selenium.All_Programs;

public class M_Reverse_Number_Using_WhileLoop {
	
	public static void main(String[] args) {
		
		int number = 12345, reversed = 0;
		
		while(number!=0) {
			
			int digit = number%10;
			
			reversed= reversed*10+digit;
			
			number/=10;			
			
		}
		
		System.out.println(reversed);
				
	}

}
