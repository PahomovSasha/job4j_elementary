package collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;
import ru.job4j.collection.FreezeStr;

public class FreezeStrTest {

    @Test
    public void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("heloo", "hello"), is(false));
    }

    @Test
    public void whenNotLength() {
        assertThat(FreezeStr.eq("heloo", "helloo"), is(false));
    }

    @Test
    public void whenUppercaseAndLowercase() {
        assertThat(FreezeStr.eq("hello", "helLo"), is(false));
    }
}
