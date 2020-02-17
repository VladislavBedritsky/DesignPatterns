package com.epam.proxy;

import com.epam.proxy.impl.AccountServiceProxy;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceProxy();
        accountService.getById(1);
    }
}
