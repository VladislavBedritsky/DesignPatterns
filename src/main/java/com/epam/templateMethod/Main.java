package com.epam.templateMethod;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader personReader = new PersonReader(new File("person.csv"));
        Reader studentReader = new StudentReader(new File("students.csv"));
        List<Object> list = studentReader.readAll();
        System.out.println(list);
    }
}