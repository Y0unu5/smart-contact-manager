package com.java;
public class Singleton implements Cloneable {
    private static Singleton instance;

    private Singleton() {
        // private constructor
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Returns a new instance
    }
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;

        try {
            singleton2 = (Singleton) singleton1.clone(); // Clone the singleton instance
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Singleton 1 hashCode: " + singleton1.hashCode());
        System.out.println("Singleton 2 hashCode: " + singleton2.hashCode());
    }
}


