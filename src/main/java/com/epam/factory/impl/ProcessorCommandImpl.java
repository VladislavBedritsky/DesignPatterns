package com.epam.factory.impl;

import com.epam.factory.Command;

public class ProcessorCommandImpl implements Command {
    public void execute() {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
    }
}
