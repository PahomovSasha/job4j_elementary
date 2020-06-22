package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        double leftNumber = Double.parseDouble(left.substring(0, left.indexOf(" ") - 1));
        double rightNumber = Double.parseDouble(right.substring(0, right.indexOf(" ") - 1));
        return Double.compare(leftNumber, rightNumber);
    }
}
