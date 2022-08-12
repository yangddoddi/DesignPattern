package com.example.design_pattern.creational.singleton_pattern;

public class Singleton4 {

    private static volatile Singleton4 instance;

    private Singleton4() {}

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    return instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
