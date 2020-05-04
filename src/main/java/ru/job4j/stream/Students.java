package ru.job4j.stream;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students implements Comparable<Students> {
    private String name;
    private int scope;

    public Students(String name, int scope) {
        this.name = name;
        this.scope = scope;
    }

    public String getName() {
        return name;
    }

    public int getScope() {
        return scope;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.scope, o.scope);
    }

    static List<Students> levelOf(List<Students> students, int bound) {
        return students
                .stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .dropWhile(student -> student.getScope() < bound)
                .collect(Collectors.toList());
    }
}
