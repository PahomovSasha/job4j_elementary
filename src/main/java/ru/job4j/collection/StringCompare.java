package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = left.length() > right.length() ? 1 : -1;
        int size = Math.min(left.length(), right.length());
        if (left.length() == right.length()) {
            rst = 0;
        }
        for (int i = 0; i < size; i++) {
            int compareChar = Character.compare(left.charAt(i), right.charAt(i));
            if (compareChar > 0) {
                rst = 1;
                break;
            } else if (compareChar < 0) {
                rst = -1;
                break;
            }
        }
        return rst;
    }
}
