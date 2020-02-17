package com.epam.strategy;

import java.util.Arrays;

public class MyArray {

    private int[] array;
    private SortStrategy sortStrategy;

    public MyArray(int capacity, SortStrategy sortStrategy) {
        array = new int[capacity];
        this.sortStrategy = sortStrategy;
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int length() {
        return array.length;
    }

    public void sort() {
        sortStrategy.sort(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
