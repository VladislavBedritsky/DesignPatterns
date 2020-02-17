package com.epam.templateMethod;

import com.epam.templateMethod.entity.Student;

import java.io.File;
import java.util.List;

public class StudentReader extends Reader {
    public StudentReader(File file) {
        super(file);
    }

    @Override
    public void addEntity(List<Object> list, String... details) {
        Student student = new Student();
        student.setId(Integer.parseInt(details[0]));
        student.setName(details[1]);
        student.setUniversityName(details[2]);

        list.add(student);
    }
}
