package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StudentListToMap {
    public static void main(String[] args) {
        System.out.println(List.of(
                new Student("Пупкин", 20),
                new Student("Пупкин", 201),
                new Student("Петров", 60))
                .stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student, (student, student2) -> student)));
    }
}
