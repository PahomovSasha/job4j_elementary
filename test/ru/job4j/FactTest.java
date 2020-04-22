package ru.job4j;

import org.junit.Test;
import ru.job4j.ex.Fact;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus5() {
        int rsl = Fact.calc(-5);
        assertThat(rsl, is("n must be > 0"));
    }
}
