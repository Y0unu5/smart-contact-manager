package com.java;

public class StringEx {
	public static void main(String[] args) {
		String str="Hello";
		String str2= str;
		
		str=str.concat(" World.");
		
		System.out.println(str);
		System.out.println(str2);
	}

}
