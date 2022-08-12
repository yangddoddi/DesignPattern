package com.example.design_pattern.creational.singleton_pattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
@Component
@Configuration
class SingletonMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        // 1. 싱글톤 구현 베이직
        // Thread-Safe하지 않다
        // 인스턴스를 생성하기 전에 이미 다른 쓰레드도 if문을 통과했다면?
        Singleton1 singleton1 = Singleton1.getInstance();

        // 2. 메서드에 Synchronized를 붙여준다면?
        // 동기화 락에 의한 성능 저하
        Singleton2 singleton2 = Singleton2.getInstance();

        // 3. 메모리에 부담이 없다면 미리 생성해놓고 같은 인스턴스만 계속 불러오면 좋겠네요
        // Eager-Initialization (이른 초기화)
        // 이 객체를 만들 때 많은 리소스가 사용되는데 정작 매번 사용되는 인스턴스가 아니라면?
        Singleton3 singleton3 = Singleton3.getInstance();

        // 4. double-checked Locking
        // 첫번째 if문에서는 synchronized를 쓰지 않으므로 성능 저하가 없고
        // 만약 if문을 통과해서 인스턴스를 생성해야하는 과정이라면 synchronized를 사용해 동기화한다
        // 생성할 필드 변수(인스턴스)에 volatile을 붙여줘야 한다. (중요 - JDK 1.5부터만 동작함)
        // 코드가 다소 복잡하다
        Singleton4 singleton4 = Singleton4.getInstance();

        // 5. 이너클래스 사용
        // 코드가 단순하고 호환성 문제가 없으며 Thread - safe하다.
        Singleton5 singleton5 = Singleton5.getInstance();

        // 그러나 위의 방법들이 모두 리플렉션에 의해 깨질 수 있다.
        Constructor<Singleton5> declaredConstructor = Singleton5.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Singleton5 singleton5New = declaredConstructor.newInstance();
        log.info("singleton5 == singleton6 ? {}", singleton5==singleton5New); // false

        // 직렬화를 사용해서도 개트릴 수 있다
        Singleton5 singleton5Serialize = null;
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"));
        out.writeObject(singleton5);

        ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"));
        singleton5Serialize = (Singleton5)in.readObject();
        log.info("singleton5 == singleton4Sirialized ? {} ", singleton5==singleton5Serialize);

        // enum으로 만들면 Reflection을 방지할 수 있다
        // 단점 - ENUM은 클래스 로딩 시점에서 미리 만들어져버린다.
        // 만약 메모리에 여유가 있다면 가장 안전한 방법
        // enum이 상속받는 ENUM은 Serializable을 구현하고 있는데, 동일한 인스턴스로 역직렬화되도록 코드로 구현되어 있음
        SingletonSafe safeSingleton = SingletonSafe.INSTANCE;
        Constructor<SingletonSafe> declaredConstructor2 = SingletonSafe.class.getConstructor();
        declaredConstructor2.setAccessible(true);
        SingletonSafe declaredSafeSingleton = declaredConstructor2.newInstance();
    }
}
