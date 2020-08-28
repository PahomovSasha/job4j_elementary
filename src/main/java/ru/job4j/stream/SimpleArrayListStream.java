package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleArrayListStream {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(-2);
        integerList.add(-1);
        integerList.add(0);
        integerList.add(2);
        integerList.add(3);
        List<Integer> integerListFilter = integerList.stream()
                .filter(integer -> integer >= 0)
                .collect(Collectors.toList());
    }
}
