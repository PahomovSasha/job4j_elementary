package collection;

import org.junit.Test;
import ru.job4j.collection.DepDescComp;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.greaterThan;

public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(-1));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2/SK1",
                "K2"
        );
        assertThat(rsl, lessThan(5));
    }

    @Test
    public void whenUpDepartmentSK2SK1() {
        int rsl = new DepDescComp().compare(
                "K2/SK2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(2));
    }

}