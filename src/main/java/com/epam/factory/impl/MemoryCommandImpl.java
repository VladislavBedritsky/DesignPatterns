package com.epam.factory.impl;

import com.epam.factory.Command;

public class MemoryCommandImpl implements Command {
    public void execute() {
        long megaBytes = 1024 * 1024;
        long freeMemory = Runtime.getRuntime().freeMemory();
        System.out.println(freeMemory / megaBytes);
    }
}
