package com.javaPrograms;

public class ReverseEachWordInGivenString {

	public static String reverseEachWord(String input) {
		
		if(input==null || input.isEmpty()) {
			return input;
		}
		
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word : words) {
			StringBuilder reversedStr = new StringBuilder(word);
			reversedStr.reverse();
			
			result.append(reversedStr).append(" ");
			
		}
		
		return result.toString().trim();
	}
	
	public static void main(String[] args) {
		
		String originalStr = "Suresh Manasa";
		String reversed = reverseEachWord(originalStr);
		
		System.out.println(originalStr);
		System.out.println(reversed);
	}
	
}

//Return early if the input is null or empty
//Split the string into an array of words using whitespace as a delimiter
//Iterate through each word in the array
//Reverse the individual word using StringBuilder's built-in method
//Append the reversed word and a space to the final result
// Trim the trailing space before returning the final string


//public class ReverseEachWord {
//    public static String reverseWords(String input) {
//        // Return early if the input is null or empty
//        if (input == null || input.isEmpty()) {
//            return input;
//        }
//
//        // Split the string into an array of words using whitespace as a delimiter
//        String[] words = input.split(" ");
//        StringBuilder result = new StringBuilder();
//
//        // Iterate through each word in the array
//        for (String word : words) {
//            // Reverse the individual word using StringBuilder's built-in method
//            StringBuilder reversedWord = new StringBuilder(word);
//            reversedWord.reverse();
//
//            // Append the reversed word and a space to the final result
//            result.append(reversedWord).append(" ");
//        }
//
//        // Trim the trailing space before returning the final string
//        return result.toString().trim();
//    }
//
//    public static void main(String[] args) {
//        String originalStr = "Java Programming Language";
//        String reversedStr = reverseWords(originalStr);
//
//        System.out.println("Original String: " + originalStr);
//        System.out.println("Reversed String: " + reversedStr);
//    }
//}
