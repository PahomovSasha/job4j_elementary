package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] arrayNumberLeft = left.split("[^0-9]");
        String[] arrayNumberRight = right.split("[^0-9]");
        int size = Math.min(arrayNumberLeft.length, arrayNumberRight.length);
        for (int i = 0; i < size; i++) {
            int numberLeft = Integer.parseInt(arrayNumberLeft[i]);
            int numberRight = Integer.parseInt(arrayNumberRight[i]);
            if (numberLeft > numberRight) {
                return 1;
            } else if (numberLeft < numberRight) {
                return -1;
            }
        }
        return 0;
    }
}
