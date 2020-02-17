package com.epam.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandFactory commandFactory = new CommandFactory();

        while (true) {
            String command = reader.readLine();
            if (command.equals("date")) {
                commandFactory.getCommand(CommandType.DATE_COMMAND).execute();
            } else if (command.equals("mem")) {
                commandFactory.getCommand(CommandType.MEMORY_COMMAND).execute();
            } else if (command.equals("proc")) {
                commandFactory.getCommand(CommandType.PROCESSOR_COMMAND).execute();
            } else {
                System.out.println("Unknown command. Please try again");
            }
        }
    }
}
