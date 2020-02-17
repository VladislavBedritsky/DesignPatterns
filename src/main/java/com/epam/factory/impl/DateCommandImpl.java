package com.epam.factory.impl;

import com.epam.factory.Command;

import java.util.Date;

public class DateCommandImpl implements Command {
    public void execute() {
        System.out.println(new Date());
    }
}
