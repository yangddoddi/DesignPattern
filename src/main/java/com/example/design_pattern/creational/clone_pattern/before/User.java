package com.example.design_pattern.creational.clone_pattern.before;

import com.example.design_pattern.creational.clone_pattern.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String address;
    private Order order;

    public User() {
    }
}
