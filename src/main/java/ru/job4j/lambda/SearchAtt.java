package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        return filter(list, attachment -> attachment.getSize() > 100);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        return filter(list, attachment -> attachment.getName().contains("bug"));
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
        System.out.println(filter(rst, x -> x.getSize() > 100 && x.getName().contains("bug")));
        System.out.println("-----------------------");
        System.out.println(filterSize(rst));
        System.out.println("-----------------------");
        System.out.println(filterName(rst));
    }

}
