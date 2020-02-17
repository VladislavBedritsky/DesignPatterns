package com.epam.templateMethod;

import com.epam.templateMethod.entity.Person;

import java.io.File;
import java.util.List;

public class PersonReader extends Reader {


    public PersonReader(File file) {
        super(file);
    }

    @Override
    public void addEntity(List<Object> list, String...details) {
        Person person = new Person();
        person.setName(details[0]);
        person.setPhone(details[1]);
        person.setScore(Integer.parseInt(details[2]));

        list.add(person);
    }
}