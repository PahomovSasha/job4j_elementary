package ru.job4j.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        int index = 0;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check,origin);
        for (String s : text) {
            if (check.contains(s)) {
                index++;
            }
        }
        return index == text.length;
    }
}
