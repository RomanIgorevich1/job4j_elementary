package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void when5Small10Then10() {
        int left = 5;
        int right = 10;
        int expected = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when8To3Then8() {
        int left = 8;
        int right = 3;
        int expected = 8;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5To5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }
}
