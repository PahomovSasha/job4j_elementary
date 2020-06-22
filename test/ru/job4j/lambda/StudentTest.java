package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {
    @Test
    public void an() {
        Student studentOne = new Student("Саша", new HashSet<>());
        studentOne.getUnits().add("Физра");
        studentOne.getUnits().add("Матан");
        Student studentTwo = new Student("Петя", new HashSet<>());
        studentTwo.getUnits().add("Физра");
        studentTwo.getUnits().add("Музыка");
        List<Student> students = List.of(studentOne, studentTwo);
        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> expected = new HashMap<>();
        expected.put("Музыка", Collections.singleton("Петя"));
        expected.put("Физра", Set.of("Саша", "Петя"));
        expected.put("Матан", Collections.singleton("Саша"));
        assertThat(result, is(expected));
    }
}
