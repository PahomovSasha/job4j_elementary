package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentListToMap {
    public static void main(String[] args) {
        System.out.println(List.of(
                new Student("Пупкин", 20),
                new Student("Петров", 60))
                .stream()
                .distinct()
                .collect(Collectors.toMap(Student::getSurname, student -> student)));
    }
}
