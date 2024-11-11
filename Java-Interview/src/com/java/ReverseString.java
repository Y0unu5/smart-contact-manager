package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
        
        String original = "Hello, World!";
        String rev = "";

        // Iterate from the end of the string to the beginning
        for (int i = original.length() - 1; i >= 0; i--) {
            rev += original.charAt(i);  // Append each character to the reversed string
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + rev);
        
        List<Integer> num= Arrays.asList(2,4,3,5,9,8,10,13,17);
        List<Integer> sqrNum= num.parallelStream().map(n ->{
        	try {
        		Thread.sleep(1000);
        	}catch (Exception e) {
				e.printStackTrace();
			}
        	return n*n;
        }).collect(Collectors.toList());
        
        System.out.println(sqrNum);
    }
}
