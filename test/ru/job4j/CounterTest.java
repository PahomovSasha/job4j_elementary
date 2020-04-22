package ru.job4j;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromOneToHundredThenTwoThousandFiveHundredFifty() {
        int rsl = Counter.sumByEven(1, 100);
        int expected = 2550;
        assertThat(rsl, is(expected));
    }
}
