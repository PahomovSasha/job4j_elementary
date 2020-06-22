package stream;

import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenA() {
        Student sasha = new Student(0);
        Student lena = new Student(49);
        Student vasa = new Student(50);
        Student kola = new Student(70);
        List<Student> students = Arrays.asList(lena, vasa, kola, sasha);
        List<Student> result = School.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expected = Arrays.asList(lena);
        assertThat(result, is(expected));
    }

    @Test
    public void whenB() {
        Student lena = new Student(49);
        Student vasa = new Student(50);
        Student kola = new Student(70);
        List<Student> students = Arrays.asList(lena, vasa, kola);
        List<Student> result = School.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = Arrays.asList(vasa);
        assertThat(result, is(expected));
    }

    @Test
    public void whenC() {
        Student lena = new Student(69);
        Student vasa = new Student(70);
        Student sasha = new Student(100);
        Student kola = new Student(101);
        List<Student> students = Arrays.asList(lena, vasa, sasha, kola);
        List<Student> result = School.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = Arrays.asList(vasa, sasha);
        assertThat(result, is(expected));
    }
}
