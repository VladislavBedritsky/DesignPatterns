package com.epam.factory;

import com.epam.factory.impl.DateCommandImpl;
import com.epam.factory.impl.MemoryCommandImpl;
import com.epam.factory.impl.ProcessorCommandImpl;

public class CommandFactory {

    public Command getCommand(CommandType commandType) {
        Command toReturn = null;
        switch (commandType) {
            case DATE_COMMAND:
                toReturn = new DateCommandImpl();
                break;
            case MEMORY_COMMAND:
                toReturn = new MemoryCommandImpl();
                break;
            case PROCESSOR_COMMAND:
                toReturn = new ProcessorCommandImpl();
                break;
            default:
                throw new IllegalArgumentException("Wrong command type:" + commandType);
        }
        return toReturn;
    }
}
