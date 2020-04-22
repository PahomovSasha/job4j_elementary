package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(2, 1, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMaxFromFourNumber() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirsMaxFromFourNumber() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMaxFromFourNumber() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void whenFourthMaxFromFourNumber() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

}
