package stream;

import org.junit.Test;
import ru.job4j.stream.Students;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentsTest {
    @Test
    public void levelOfMoreHundred() {
        Students sasha = new Students("Саша", 10);
        Students lena = new Students("Лена", 50);
        Students vasa = new Students("Вася", 80);
        Students kola = new Students("Коля", 110);
        Students test = null;
        List<Students> students = Arrays.asList(kola, sasha, lena, vasa, test);
        List<Students> result = Students.levelOf(students, 100);
        List<Students> expected = Arrays.asList(kola);
        assertThat(result, is(expected));
    }
}
