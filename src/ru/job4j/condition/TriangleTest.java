package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenTriangleExist() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 9);
        Point c = new Point(9, 1);
        Triangle triangle = new Triangle(a, b, c);
        double resultArea = triangle.area();
        assertThat(resultArea, is(32.0));
    }

    @Test
    public void triangleNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double resultArea = triangle.area();
        assertThat(resultArea, is(-1.0));
    }
}
