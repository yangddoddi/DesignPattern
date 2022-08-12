package com.example.design_pattern.creational.singleton_pattern;

class Singleton1 {
    private static Singleton1 instance;

    public static Singleton1 getInstance() {
        if (instance == null) {
            return instance = new Singleton1();
        } else {
            return instance;
        }
    }
}
