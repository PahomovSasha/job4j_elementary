package collection;

import org.junit.Test;
import ru.job4j.collection.Departments;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1/SSK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(Departments.sortAsc(result), is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(Departments.sortAsc(result), is(expect));
    }

    @Test
    public void whenAllDepsThenSortedAsc() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K1/SK1", "K2/SK1/SSK2");
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        List<String> result = Departments.fillGaps(input);
        assertThat(Departments.sortAsc(result), is(expect));
    }

    @Test
    public void whenAllDepsThenSortedDesc() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K1/SK1", "K2/SK1/SSK2");
        List<String> expect = Arrays.asList("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");
        List<String> result = Departments.fillGaps(input);
        assertThat(Departments.sortDesc(result), is(expect));
    }

}
