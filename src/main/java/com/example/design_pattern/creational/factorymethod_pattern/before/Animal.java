package com.example.design_pattern.creational.factorymethod_pattern.before;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Animal {
    String species;
    String color;

    public Animal(String name, String species, String color) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("유효하지 않은 이름");
    }

    public void run(String target) {
        if ( species.equals("rabbit") ) {
            System.out.println("토끼가 깡총깡총 뛰어갑니다!");
        }
        if ( species.equals("turtle") ) {
            System.out.println("거북이는 빠르게 달릴 수 없습니다..");
        }
    }
}
