package com.java;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.INSTANCE;
		Singleton1 singleton12 = Singleton1.INSTANCE;

		singleton1.display();
		singleton12.display();

		System.out.println("Are both instances the same? " + (singleton1 == singleton12));
	}
}
