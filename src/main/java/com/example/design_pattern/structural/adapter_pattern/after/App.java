package com.example.design_pattern.structural.adapter_pattern.after;

import com.example.design_pattern.structural.adapter_pattern.after.security.LoginHandler;
import com.example.design_pattern.structural.adapter_pattern.after.security.UserDetailService;

/*
*
* 코드를 고칠 수 없는 경우..
*
* 만약 코드를 고칠 수 있는 경우 기존 코드에 직접 구현을 할 수 있도록 만들면 된다.
*
* 단일 원칙 원칙(SRP)를 따르자면 좋지 않음.
*
* */

/*
*
* 어댑터 패턴 : 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴.
*
* 장점
* - 기존 코드를 변경하지 않고 원하는 인터페이스 구현체를 만들어 재사용할 수 있다. (OCP)
* - 기존 코드가 하던 일과 특정 인터페이스 구현체로 변환하는 작업을 각기 다른 클래스로 분리하여 관리할 수 있다
*
* 단점
* - 새 클래스가 생겨 복잡도가 증가할 수 있다.
* - 이것을 방지하기 위해 기존 코드에 직접 인터페이스를 구현시키는 방법도 있다.
*
* */


public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);
        String login = loginHandler.login("user", "password");
        System.out.println(login);
    }
}
