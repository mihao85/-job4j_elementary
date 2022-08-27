package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenX11X22X33X44Then() {
        double expected = 2.85;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double res = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, res, 0.01);
    }

    @Test
    public void whenX12X23X34X45Then5() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;
        double res = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, res, 0.01);
    }

    @Test
    public void whenX13X24X35X46Then5() {
        double expected = 2.82;
        int x1 = 3;
        int y1 = 4;
        int x2 = 5;
        int y2 = 6;
        double res = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, res, 0.01);
    }
}