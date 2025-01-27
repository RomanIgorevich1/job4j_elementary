package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void when11to31then2() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to54then1() {
        int x1 = 4;
        int y1 = 4;
        int x2 = 5;
        int y2 = 4;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to82then3() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 8;
        int y2 = 2;
        double expected = 3.16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}