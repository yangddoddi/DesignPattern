package com.example.design_pattern.creational.singleton_pattern;

public class Singleton2 {
    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            return instance = new Singleton2();
        } else {
            return instance;
        }
    }
}
