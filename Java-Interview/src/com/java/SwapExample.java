package com.java;
public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int c =9;
        int e=20;
        
        c = c + e; // a now becomes 15 (5 + 10)
        e = c - e; // b becomes 5 (15 - 10)
        c = c - e; // a becomes 10 (15 - 5)

        // Swapping without using a temporary variable
        a = a ^ b; // a now becomes 15 (5 XOR 10)
        b = a ^ b; // b becomes 5 (15 XOR 10)
        a = a ^ b; // a becomes 10 (15 XOR 5)

        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 5
        
        System.out.println(c);
        System.out.println(e);
    }
}
