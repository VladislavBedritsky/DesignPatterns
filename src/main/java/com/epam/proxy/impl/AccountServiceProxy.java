package com.epam.proxy.impl;

import com.epam.proxy.Account;
import com.epam.proxy.AccountService;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class AccountServiceProxy implements AccountService {

    private static Logger log = Logger.getLogger(AccountServiceProxy.class.getName());
    private AccountService accountService = new AccountServiceImpl();

    public Account getById(long id) {
        log.info("В "+ LocalDateTime.now()+" просмотрен аккаунт с id = "+id);
        return accountService.getById(id);
    }
}
