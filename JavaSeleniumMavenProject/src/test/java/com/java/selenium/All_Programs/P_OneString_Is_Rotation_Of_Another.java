package com.java.selenium.All_Programs;

public class P_OneString_Is_Rotation_Of_Another {
	
	public static void main(String[] args) {
		
		String s1 = "ABCD";
		String s2 = "CDAB";
		
		String concat = s1+s1;
		if(concat.contains(s2)) {
			
			System.out.println("Yes");
		}
		else {
			
			System.out.println("No");
		}				
		
	}

}
