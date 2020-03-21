package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int inX1 = 10;
        int inY1 = 15;
        int inX2 = 3;
        int inY2 = 5;
        double expected = 12.20;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
