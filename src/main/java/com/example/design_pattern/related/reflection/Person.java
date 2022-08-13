package com.example.design_pattern.related.reflection;

import lombok.ToString;

@ToString
public class Person {
    private final String name;
    private final int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person getPerson(String name, int age) {
        return new Person(name, age);
    }
}
