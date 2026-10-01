package com.javaPrograms;

public class ReverseSentenceWordByWord {

	public static String reverseWords(String sentence) {
		if(sentence == null || sentence.trim().isEmpty()) {
			return sentence;
		}
		
		String[] words = sentence.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			reversed.append(words[i]);
			
			if(i>0) {
				reversed.append(" ");
			}
		}
		
		return reversed.toString();
	}
	
	public static void main(String[] args) {
		
		String inputSentence = "Suresh Manasa Narsi KrishanAdwaith";
		String reversedSentence = reverseWords(inputSentence);
		
		System.out.println(inputSentence);
		System.out.println(reversedSentence);
	}
}



//Split by one or more whitespace characters
//Iterate backwards through the array
//Add space between words

//public class ReverseSentence {
//    public static String reverseWords(String sentence) {
//        if (sentence == null || sentence.trim().isEmpty()) {
//            return sentence;
//        }
//
//        // Split by one or more whitespace characters
//        String[] words = sentence.trim().split("\\s+");
//        StringBuilder reversed = new StringBuilder();
//
//        // Iterate backwards through the array
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i > 0) {
//                reversed.append(" "); // Add space between words
//            }
//        }
//
//        return reversed.toString();
//    }
//
//    public static void main(String[] args) {
//        String input = "Suresh Manasa KrishanAdhwaith";
//        // Output: "fun is programming Java"
//        System.out.println(reverseWords(input)); 
//    }
//}
