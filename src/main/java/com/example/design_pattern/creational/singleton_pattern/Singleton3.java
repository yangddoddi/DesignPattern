package com.example.design_pattern.creational.singleton_pattern;

public class Singleton3 {
    private final static Singleton3 INSTANCE = new Singleton3();

    public static synchronized Singleton3 getInstance() {
            return INSTANCE;
    }
}
