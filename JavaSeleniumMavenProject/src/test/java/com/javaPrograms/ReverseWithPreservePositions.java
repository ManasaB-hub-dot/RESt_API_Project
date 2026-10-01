package com.javaPrograms;


public class ReverseWithPreservePositions{
	
	public static String reverseWithPositions(String input) {
		
		if(input==null) {
			
			return null;
		}
		
		char[] inputArray = input.toCharArray();
		char[] resultArray = new char[inputArray.length];
		
		for(int i=0; i<inputArray.length;i++) {
			
			if(inputArray[i]==' ') {
				resultArray[i] = ' ';
			}
			
		}
			int j=inputArray.length-1;
			
			for(int i=0;i<inputArray.length;i++) {
				
				if(inputArray[i]!=' ') {
					
					while(resultArray[j]==' ') {
						
						j--;
					}
					
					resultArray[j]=inputArray[i];
					j--;
				}
				
			}
			
			return new String(resultArray);
		}
	
		public static void main(String[] args) {
			
			String input = "Suresh Manasa";
			String output = reverseWithPositions(input);
			
			System.out.println(input);
			System.out.println(output);
		}
	}
	


/*public class ReverseWithPreservePositions {

	public static String reverseWithPosition(String input) {

		if (input == null) {

			return null;
		}

		char[] inputArray = input.toCharArray();
		char[] resultArray = new char[input.length()];
		
		// Step 1: Copy all spaces to the result array at their exact positions

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}

	   // Step 2: Fill the remaining slots with non-space characters in reverse
		
		int j = inputArray.length - 1;

		for (int i = 0; i < inputArray.length; i++) {

			if (inputArray[i] != ' ') {

				while (resultArray[j] == ' ') {

					j--;

				}

				resultArray[j] = inputArray[i];
				j--;

			}

		}

		return new String(resultArray);

	}

	public static void main(String[] args) {

		String input = "G Suresh";
		String output = reverseWithPosition(input);

		System.out.println(input);

		System.out.println(output);

	}

}

*/
		