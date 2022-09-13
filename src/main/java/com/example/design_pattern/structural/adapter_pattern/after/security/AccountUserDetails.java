package com.example.design_pattern.structural.adapter_pattern.after.security;


import com.example.design_pattern.structural.adapter_pattern.after.Account;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetails implements UserDetails {
    private final Account account;

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
