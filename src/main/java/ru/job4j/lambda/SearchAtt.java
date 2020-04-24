package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment attachment : list) {
            if (predicate.test(attachment)) {
                rsl.add(attachment);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<Attachment> rst = List.of(
                new Attachment("one", 220),
                new Attachment("bug", 101),
                new Attachment("bug", 50)
        );
        System.out.println(filter(rst,  x -> x.getSize() > 100 && x.getName().equals("bug")));
    }

}
