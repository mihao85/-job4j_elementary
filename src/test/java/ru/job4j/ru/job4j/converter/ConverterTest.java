package ru.job4j.ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Dollar() {
        float in = 140;
        float expected = 8;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);

    }

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 140;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}