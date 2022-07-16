package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.02);
    }

    @Test
    public void when22to45then3605() {
        double expected1 = 3.605;
        int x1 = 2;
        int y1 = 2;
        int x2 = 4;
        int y2 = 5;
        double out1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected1, out1, 0.02);
    }

    @Test
    public void when32to4812then4609() {
        double expected2 = 46.097;
        int x1 = 3;
        int y1 = 2;
        int x2 = 48;
        int y2 = 12;
        double out2 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected2, out2, 0.02);
    }
}