package com.example.design_pattern.creational.clone_pattern;

import com.example.design_pattern.creational.clone_pattern.after_clonneable.CloneableUser;
import com.example.design_pattern.creational.clone_pattern.after_deep.DeepCopyUser;
import com.example.design_pattern.creational.clone_pattern.before.User;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Order order = new Order(0L,30000);

        User user = User.builder()
                .id(0L)
                .name("배고프다")
                .address("평양")
                .order(order)
                .build();

        User copyUser = new User();
        copyUser.setId(user.getId());
        copyUser.setName(user.getName());
        copyUser.setAddress(user.getAddress());
        copyUser.setOrder(user.getOrder());


        CloneableUser user2 = CloneableUser.builder().id(0L)
                .address("주소")
                .name("창식이")
                .order(order)
                .build();

        CloneableUser copyUser2 = (CloneableUser) user2.clone();
        System.out.println(user2==copyUser2); // false
        System.out.println(user2.equals(copyUser2)); // true

        user2.getOrder().setPrice(50000);
        System.out.println(copyUser2.getOrder().getPrice());


        DeepCopyUser user3 = DeepCopyUser.builder()
                .id(0L)
                .address("아프리카")
                .name("빠삐콩")
                .order(order)
                .build();

        DeepCopyUser copyUser3 = user3.clone();
        System.out.println(user3==copyUser3); // false
        System.out.println(user3.equals(copyUser3)); // true

        user3.getOrder().setPrice(20000000);
        System.out.println(copyUser3.getOrder().getPrice()); // 50000
    }
}
