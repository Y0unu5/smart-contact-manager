package com.java;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
String str = "Java is fun; let's learn it!";
        
        // Create a StringTokenizer with space as the default delimiter
        StringTokenizer tokenizer = new StringTokenizer(str);
        
        System.out.println("Tokens using default delimiter (whitespace):");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        
        // Create a StringTokenizer with custom delimiters
        StringTokenizer tokenizer2 = new StringTokenizer(str, " ;'");
        
        System.out.println("\nTokens using custom delimiters (space, semicolon, and apostrophe):");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }
        
        String[] tokens = str.split("[ ;']");

        System.out.println("Tokens using split() method:");
        for (String token : tokens) {
            System.out.println(token);
        }
	}

}
