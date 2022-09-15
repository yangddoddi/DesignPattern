package com.example.design_pattern.structural.composite_pattern.after;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Bag implements Component {
    private List<Component> list = new ArrayList<>();
    /*
    * 중요
    * => 모든 조합은 컴포넌트에서 이뤄지기 때문에 Leaf 타입은 Component를 참조해야함
    * */

    public Bag(List<Component> list) {
        this.list = list;
    }

    /*
    * 가방이 스스로의 가격을 알아서 통지하는 쪽이 오히려 객체지향적임
    * */

    @Override
    public int getPrice() {
        return list.stream()
                .mapToInt(e -> e.getPrice())
                .sum();
    }

    public void add(Component item) {
        list.add(item);
    }
}
