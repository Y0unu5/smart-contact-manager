package com.java;

import java.lang.reflect.Method;

public class AnnotationProcessor {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		Method[] methods = MyClass.class.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(CustomAnnotation.class)) {
				CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
				System.out.println("Method: " + method.getName());
				System.out.println("Value: " + annotation.value());
				System.out.println("Number: " + annotation.number());
			}
		}
	}

}
