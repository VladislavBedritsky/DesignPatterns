package com.epam.proxy.impl;

import com.epam.proxy.Account;
import com.epam.proxy.AccountService;

public class AccountServiceImpl implements AccountService {

    public Account getById(long id) {
        return new Account(id, "123456/7890/12/1/1");
    }
}
