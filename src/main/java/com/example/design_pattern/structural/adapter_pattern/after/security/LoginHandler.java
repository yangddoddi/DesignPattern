package com.example.design_pattern.structural.adapter_pattern.after.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {
    private final UserDetailService userDetailService;

    public String login(String username, String password) {
        UserDetails userDetails = userDetailService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getPassword();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
