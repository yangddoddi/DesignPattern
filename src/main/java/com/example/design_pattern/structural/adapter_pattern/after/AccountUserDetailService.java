package com.example.design_pattern.structural.adapter_pattern.after;


import com.example.design_pattern.structural.adapter_pattern.after.security.AccountUserDetails;
import com.example.design_pattern.structural.adapter_pattern.after.security.UserDetailService;
import com.example.design_pattern.structural.adapter_pattern.after.security.UserDetails;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailService implements UserDetailService {
    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
