package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class MinDiapasonTest {

    @Test
    public void whenFirsMin() {
        int[] array = new int[] {-1, 0, 5, 10};
        int start = 1;
        int finish = 3;
        int expected = 0;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int expected = 1;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int expected = 2;
        int result = MinDiapason.findMin(array, start, finish);
        Assert.assertEquals(expected, result);
    }
}