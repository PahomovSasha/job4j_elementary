package collection;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import ru.job4j.collection.LexSort;

import java.util.Arrays;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1.1. Task.",
                "7. Task.",
                "1.2. Task.",
                "2. Task.",
                "7.5. Task."
        };
        String[] out = {
                "1.1. Task.",
                "1.2. Task.",
                "2. Task.",
                "7. Task.",
                "7.5. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}
