package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan174Then85() {
        short in = 174;
        double expected = 85.1;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomen167Then65() {
        short in = 167;
        double expected = 65.55;
        double out = Fit.womenWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}