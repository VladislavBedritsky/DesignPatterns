package com.epam.strategy;

import com.epam.strategy.impl.AscendingSortStrategy;
import com.epam.strategy.impl.DescendingSortStrategy;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        SortStrategy ascendingSortStrategy = new AscendingSortStrategy();
        SortStrategy descendingSortStrategy = new DescendingSortStrategy();

        MyArray array = new MyArray(10, ascendingSortStrategy);

        for (int i = 0; i < array.length(); i++) {
            array.set(i, random.nextInt(100));
        }
        System.out.println(array);

        array.sort();
        System.out.println(array);
    }
}
