package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int size = Math.min(leftChar.length, rightChar.length);
        for (int i = 0; i < size; i++) {
            int compareChar = Character.compare(leftChar[i], rightChar[i]);
            if (compareChar > 0) {
                return 1;
            } else if (compareChar < 0) {
                return -1;
            }
        }
        if (leftChar.length == rightChar.length) {
            return 0;
        }
        return leftChar.length > rightChar.length ? 1 : -1;
    }
}
