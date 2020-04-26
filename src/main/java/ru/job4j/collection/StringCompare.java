package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = left.length() > right.length() ? 1 : -1;
        int size = Math.min(left.length(), right.length());
        for (int i = 0; i < size; i++) {
            int compareChar = Character.compare(left.charAt(i), right.charAt(i));
            if (compareChar != 0) {
                return compareChar > 0 ? 1 : -1;
            }
        }
        return left.length() == right.length() ? 0 : rst;
    }
}
