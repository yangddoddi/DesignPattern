package com.example.design_pattern.creational.clone_pattern.after_constructor;

import com.example.design_pattern.creational.clone_pattern.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ConstructorUser {
    private Long id;
    private String name;
    private String address;
    private Order order;

    public ConstructorUser ( ConstructorUser origin ) {
        this.id = origin.getId();
        this.name = origin.getName();
        this.address = origin.getAddress();
        this.order = new Order(order.getId(), order.getPrice());
    }
}