package ru.job4j.collection;

import java.util.*;
import java.util.stream.Collectors;

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
        ArrayList<Character> original = left.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Character> changed = right.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Character character : original) {
            changed.remove(character);
        }
        return changed.size() == 0;
    }
}
