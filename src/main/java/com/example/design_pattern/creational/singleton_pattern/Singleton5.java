package com.example.design_pattern.creational.singleton_pattern;

import java.io.Serializable;

class Singleton5 implements Serializable {
    Singleton5() {}

    private static class SingletonBox {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonBox.INSTANCE;
    }
}
