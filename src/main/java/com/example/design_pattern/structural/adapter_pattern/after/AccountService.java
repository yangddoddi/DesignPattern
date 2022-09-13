package com.example.design_pattern.structural.adapter_pattern.after;

public class AccountService  {
    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createdNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}
