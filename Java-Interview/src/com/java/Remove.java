package com.java;

import java.util.HashSet;
import java.util.Set;

public class Remove{
	public static void main(String[] args) {
		int[] arr= {1, 2, 2, 3, 4, 4, 5};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int x: arr) {
			set.add(x);
		}
		
		set.forEach(System.out::println);
	}
}