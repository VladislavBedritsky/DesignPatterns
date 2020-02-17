package com.epam.templateMethod;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Reader {

    private File file;

    public Reader(File file) {
        this.file = file;
    }

    public List<Object> readAll() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Object> list = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");

            addEntity(list, details);
        }
        br.close();
        return list;
    }

    public abstract void addEntity (List<Object> list, String...details);
}
