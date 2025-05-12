package org.example;

import java.util.Scanner;

public class Something {
    public static String giveMeSomething(String input) {
        return "something " + input;
    }

    public static void main(String[] args) {
        // Примеры вызова
        System.out.println(giveMeSomething("is better than nothing")); // something is better than nothing
        System.out.println(giveMeSomething("Bob Jane"));               // something Bob Jane
        System.out.println(giveMeSomething("something"));              // something something
    }
}
