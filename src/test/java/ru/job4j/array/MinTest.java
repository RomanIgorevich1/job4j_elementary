package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class MinTest {

    @Test
    public void whenFirsMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int expected = 3;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5};
        int expected = 2;
        int result = Min.findMin(array);
        Assert.assertEquals(expected, result);
    }

}