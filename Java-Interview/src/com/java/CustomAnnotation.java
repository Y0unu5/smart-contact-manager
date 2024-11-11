package com.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
	String value() default "default value"; 

	int number() default 0;

}

class MyClass {
	
	@CustomAnnotation(value="Hello its custom",number=45 )
	public void myMethod() {
		System.out.println("This is myMethod.");
	}

	@CustomAnnotation
	public void anotherMethod() {
		System.out.println("This is anotherMethod.");
	}
}