package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    /**
     * Метод проверяет две строчки на идентичность состоящих символов.
     *
     * @param left  - оригинальная строка
     * @param right - изменённая строка
     * @return Символы совпадаю - true, иначе - false
     */
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        boolean rsl = true;
        char[] original = left.toCharArray();
        char[] changed = right.toCharArray();
        Arrays.sort(original);
        Arrays.sort(changed);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != changed[i]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
