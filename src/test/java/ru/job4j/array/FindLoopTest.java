package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHasNo6ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind4() {
        int[] data = {9, 8, 7, 6, 5, 4, 3, 7};
        int el = 5;
        int start = 1;
        int finish = 6;
        int expected = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFindMinus1() {
        int[] data = {2, 3, 4, 5, 5, 4, 3, 1};
        int el = 2;
        int start = 3;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }
}