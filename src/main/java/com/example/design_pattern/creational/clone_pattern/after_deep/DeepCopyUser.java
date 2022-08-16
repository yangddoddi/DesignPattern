package com.example.design_pattern.creational.clone_pattern.after_deep;

import com.example.design_pattern.creational.clone_pattern.Order;
import com.example.design_pattern.creational.clone_pattern.after_clonneable.CloneableUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class DeepCopyUser {
    private Long id;
    private String name;
    private String address;
    private Order order;

    public DeepCopyUser() {
    }

    public DeepCopyUser clone() {
        Order newOrder = new Order(order.getId(), order.getPrice());

        return DeepCopyUser.builder()
                .id(this.id)
                .address(this.address)
                .order(newOrder)
                .name(this.name)
                .build();
    }
}
