package com.example.design_pattern.related.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Constructor<Person> con = Person.class.getDeclaredConstructor(String.class, int.class);
        con.setAccessible(true);
        Person person = con.newInstance("주호민",13);
        System.out.println(person);

        Field field = person.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "침착맨");
        System.out.println(person);

    }
}
