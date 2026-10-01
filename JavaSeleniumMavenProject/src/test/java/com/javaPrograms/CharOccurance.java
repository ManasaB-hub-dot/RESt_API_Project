package com.javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance {
    public static void main(String[] args) {
        String inputString = "hello world";
        
        // Call the method to count characters
        countCharacterOccurrences(inputString);
    }

    public static void countCharacterOccurrences(String str) {
        // Create a HashMap to store character and its count
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string into a character array and loop through it
        for (char c : str.toCharArray()) {
            // If character is present, increment its count by 1
            // If character is not present, add it with an initial count of 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the map containing character frequencies
        System.out.println("Character Occurrences in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

