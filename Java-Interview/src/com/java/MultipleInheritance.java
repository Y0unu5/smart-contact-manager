package com.java;
//class Animal{
//	void bark() {
//		System.out.println("Animal Barks...");
//	}
//}
//
//class Cat extends Animal{
//	@Override
//	void bark() {
//		System.out.println("Cat meow meow..");
//	}
//}
//
//class Dog{
//	void bark() {
//		System.out.println("Dog barks..");
//	}
//}
//
//class Lion extends Cat, Dog{
//	
//}

interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        // Resolve ambiguity by explicitly choosing which interface's method to call
        A.super.show(); // Call A's show method
        B.super.show(); // Call B's show method
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
    	 C obj = new C();
         obj.show();
	}
   
}
