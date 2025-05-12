package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Advanced Text Analyzer demonstrating various Java String methods.
 */
public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Demonstrate various String methods

        System.out.println("\n--- String Methods Demonstration ---");
        // Prompt for a sentence
        System.out.print("\nEnter a sentence: ");
        String sentence = scanner.nextLine();



        /**
         * Returns the number of characters in the string.
         * Use case: Get the total number of characters typed by the user.
         */
        System.out.println("Length: "+sentence.length());

        /**
         * Checks whether the string is empty (i.e., length is 0).
         * Use case: Check if the user forgot to enter any text.
         */
        System.out.println("Is the sentence empty?  "+sentence.isEmpty());

        /**
         * Converts all characters in the string to uppercase.
         * Use case: Normalize text input to uppercase for consistent processing or comparison.
         */
        System.out.println("Uppercase: "+sentence.toUpperCase());

        /**
         * Converts all characters in the string to lowercase.
         * Use case: Normalize input to lowercase for case-insensitive operations.
         */
        System.out.println("Lowercase: " + sentence.toLowerCase());

        /**
         * Returns the character at the specified index.
         * Use case: Extract the specified character for a specific feature implementation.
         */
        if (!sentence.isEmpty()) {
            System.out.println("First character: " + sentence.charAt(0));
        }

        /**
         * Returns a substring from index 0 to 5 (exclusive).
         * Use case: Extract a substring (e.g. preview, keyword) from the user input.
         */
        if(sentence.length() >= 5){
            System.out.println("Substring(from: 0, before: 5): "+sentence.substring(0,5));
        }

        /**
         * Checks whether the string contains the specified keyword.
         * Use case: Check if a keyword like "Java" exists in the sentence for content filtering or search.
         */
        System.out.println("Does the sentence contain 'Java': "+ sentence.contains("Java"));
        // case-insensitive way:
        System.out.println("Does the sentence contain 'java': "+ sentence.toLowerCase().contains("java"));

        /**
         * Checks whether the string starts with the specified prefix.
         * Use case: Validate sentence starts with a specific word or phrase (like command parsing, e.g., git ...).
         */
        System.out.println("Does our sentence start with 'The'? "+sentence.startsWith("The"));

        /**
         * Checks whether the string ends with the specified suffix.
         * Use case: Validate if a sentence ends with specific punctuation (e.g., proper formatting).
         */
        System.out.println("Does our sentence end with  '.': " + sentence.endsWith("."));

        /**
         * Returns the index of the first occurrence of the specified character.
         * Use case: Find the position of a character like 'a' to analyze or manipulate specific parts.
         */
        System.out.println("Index of 'a': " + sentence.indexOf('a'));

        /**
         * Replaces all occurrences of a target substring with a replacement.
         * Use case: Replace a specific word with another to customize or translate user input.
         */

        System.out.println("Replace 'Java' with 'Python': " + sentence.replace("Java", "Python"));

        /**
         * Splits the string around matches of the given delimiter (e.g. space).
         * Use case: Split sentence into individual words for tokenization or word count.
         */
        String[] words = sentence.split(" ");
        System.out.println("Split into parts: "+ Arrays.toString(words));

        /**
         * Removes leading and trailing whitespace.
         * Use case: Clean up user input by removing leading/trailing whitespaces.
         */
        System.out.println("All leading and trailing whitespaces are trimmed. '"+ sentence.trim()+"'");

        /**
         * Compares this string to the specified string for equality (case-sensitive).
         * Use case: Check if user input matches an exact word or phrase (case-sensitive).
         */
        System.out.println("Is the sentence equal to 'Hello'? "+sentence.equals("Hello"));

        /**
         * Compares this string to the specified string, ignoring case considerations.
         * Use case: Case-insensitive comparison for user input matching.
         */
        System.out.println("Is the sentence equal to 'Hello'? (IgnoreCase) "+sentence.equalsIgnoreCase("Hello"));


        /**
         * Returns a formatted string using the specified format string and arguments.
         */
        // String formatted = String.format("Formatted: %s - %d", sentence, sentence.length());
        // System.out.println(formatted);
        // System.out.printf("%s - %d",  sentence, sentence.length());


        /**
         * Returns the hash code for this string.
         * Use case: Get a unique hash code of the string (used in collections like HashMap).
         */
        System.out.println("Hash Code: " + sentence.hashCode());





    }

}