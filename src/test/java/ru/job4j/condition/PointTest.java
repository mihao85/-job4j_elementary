package ru.job4j.condition;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void whenX02Y00then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenX610Y38then2() {
        int x1 = 6;
        int x2 = 10;
        int y1 = 3;
        int y2 = 8;
        double expected = 6.4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenX54Y86then2() {
        int x1 = 5;
        int x2 = 4;
        int y1 = 8;
        int y2 = 6;
        double expected = 2.2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

}