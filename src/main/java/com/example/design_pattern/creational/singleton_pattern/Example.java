package com.example.design_pattern.creational.singleton_pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Example {
    public static void main(String[] args) {
        // 애플리케이션 실행 정보 관리
        Runtime runtime = Runtime.getRuntime();

//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 몇 번을 꺼내도 모두 같은 인스턴스(싱글턴)
    }
}
