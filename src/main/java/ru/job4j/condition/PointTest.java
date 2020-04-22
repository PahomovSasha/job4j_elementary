package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance3D() {
        int inX1 = 10;
        int inY1 = 15;
        int inX2 = 3;
        int inY2 = 5;
        int inZ1 = 6;
        int inZ2 = 7;
        Point pointOne = new Point(inX1, inY1, inZ1);
        Point pointTwo = new Point(inX2, inY2, inZ2);
        double expected = 12.24;
        double out = pointOne.distance3d(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }
}
