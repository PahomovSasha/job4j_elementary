package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String one = o1.contains("/") ? o1.substring(0, o1.indexOf("/")) : o1;
        String two = o2.contains("/") ? o2.substring(0, o2.indexOf("/")) : o2;
        if (one.equals(two)) {
            return Integer.compare(o1.length(), o2.length());
        }
        return o2.compareTo(o1);
    }

    public static void main(String[] args) {
        List<String> test = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        test.sort(new DepDescComp());
        System.out.println(test);
    }
}
