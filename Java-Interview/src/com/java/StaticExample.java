package com.java;
class Parent {
	
	int a=10;
	
    public Parent() {
		
		System.out.println("Parent Con");
	}

	// Static method in the parent class
    public static void display() {
        System.out.println("Static method in Parent class");
    }
    
    // Non-static method in the parent class
    public void show() {
        System.out.println("Non-static method in Parent class");
    }
}

class Child extends Parent {
	int a=14;
	
    public Child() {
		super();
		System.out.println("Child constructor,,,,");
	}

	// Static method in the child class (method hiding, not overriding)
    public static void display() {
        System.out.println("Static method in Child class");
    }
    
    // Non-static method in the child class (method overriding)
    @Override
    public void show() {
        System.out.println("Non-static method in Child class");
    }
}
public class StaticExample {
   public static void main(String[] args) {
	   // Creating an instance of Child
       Child child = new Child();
       
       
       // Static method call using the class name
      // Parent.display(); // Calls Parent's static method
       //Child.display();  // Calls Child's static method
       
       Parent pare=new Parent();
      // System.out.println(pare);
       
       // Calling non-static method
       Parent parentRef = new Child();
       parentRef.show(); // Calls Child's show method (runtime polymorphism)
}
}
