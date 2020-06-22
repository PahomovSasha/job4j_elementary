package ru.job4j.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Departments {

    /**
     * Метод разбиения департаментов на подразделения
     *
     * @param deps - департаменты
     * @return подразделения департаментов
     */
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     * Метод сортировки подразделений по возрастанию
     *
     * @param orgs - подразделения
     * @return отсортированные по возрастанию подразделения
     */
    public static List<String> sortAsc(List<String> orgs) {
        return orgs.stream().sorted(String::compareTo).collect(Collectors.toList());
    }

    /**
     * Метод сортировки подразделений по убыванию
     *
     * @param orgs - подразделения
     * @return отсортированные по убыванию подразделения
     */
    public static List<String> sortDesc(List<String> orgs) {
        return orgs
                .stream()
                .sorted((o1, o2) -> {
                    String one = o1.contains("/") ? o1.substring(0, o1.indexOf("/")) : o1;
                    String two = o2.contains("/") ? o2.substring(0, o2.indexOf("/")) : o2;
                    if (one.equals(two)) {
                        return o1.compareTo(o2);
                    }
                    return o2.compareTo(o1);
                })
                .collect(Collectors.toList());
    }
}
