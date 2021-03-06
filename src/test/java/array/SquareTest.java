package array;

import org.junit.Test;
import ru.job4j.stragery.Square;

import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+++++")
                                .add("+   +")
                                .add("+++++")
                                .toString()
                )
        );
    }
}
