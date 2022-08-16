package com.example.design_pattern.creational.clone_pattern.after_clonneable;

import com.example.design_pattern.creational.clone_pattern.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CloneableUser implements Cloneable {
    private Long id;
    private String name;
    private String address;
    private Order order;

    public CloneableUser() {
    }

    @Override
    public CloneableUser clone() throws CloneNotSupportedException {
            CloneableUser clone = (CloneableUser) super.clone();
            return clone;
    }
}
