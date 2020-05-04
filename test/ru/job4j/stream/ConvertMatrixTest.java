package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrixTest {
    @Test
    public void convertMatrix() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> result = ConvertMatrix.convert(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(result, is(expected));
    }
}
