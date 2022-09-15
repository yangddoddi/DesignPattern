package com.example.design_pattern.structural.composite_pattern;

import com.example.design_pattern.structural.composite_pattern.after.Bag;
import com.example.design_pattern.structural.composite_pattern.after.Component;
import com.example.design_pattern.structural.composite_pattern.after.Equipment;
import com.example.design_pattern.structural.composite_pattern.before.Inventory;
import com.example.design_pattern.structural.composite_pattern.before.Item;
import com.example.design_pattern.structural.composite_pattern.before.User;

import java.util.List;

/*
* 컴포짓Composite 패턴?
* 그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴
* 클라이언트 입장에서는 "전체" "부분" 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조를 만든다
* == Part-Whole Hierarchy
*
* Client -> Component(Interface) <- Composite <- Leaf(Primitive)
*
* 장점
* 1. 복잡한 트리 구조를 편리하게 사용할 수 있다.
* 2. 다형성과 재귀를 활용할 수 있다.
* 3. 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다.
* (Open Closed Principals)
*
* 단점
* - 공통된 인터페이스를 만들어야하기 때문에 과도한 추상화가 적용될 수 있다.
* -> 만약 타입 체크가 필요한 지경까지 간다면 다른 방법을 고안해야함.
*
* */

public class Composite_App {
    public static void main(String[] args) {

        // before
        Item basicSword = new Item("그냥 칼", 100);
        Item goodSword = new Item("좋은 칼", 200);

        Inventory inventory = new Inventory();
        inventory.add(basicSword);
        inventory.add(goodSword);

        User user = new User();
        user.printPrice(basicSword);
        user.printPrice(inventory);

        /*
        *
        * 사용 가능한 가장 추상적인 타입을 사용하는 것이 좋다.
        *
        * */

        // after
        Component basic = new Equipment("그냥 칼", 500);
        Component good = new Equipment("좋은 칼", 1000);
        Component bag = new Bag(List.of(basic,good));

        System.out.println(basic.getPrice());
        System.out.println(good.getPrice());
        System.out.println(bag.getPrice());
    }
}
