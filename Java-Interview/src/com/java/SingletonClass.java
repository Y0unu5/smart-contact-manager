package com.java;

public class SingletonClass {
	private static volatile SingletonClass instance;

	private SingletonClass() {
		if (instance != null) {
			throw new IllegalStateException("Already initialized.");
		}
	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			synchronized (SingletonClass.class) {
				if (instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Sigleton CLASSS");
	}

	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();
        
		singleton.showMessage();
		
		System.out.println(singleton.hashCode());
	}
}
