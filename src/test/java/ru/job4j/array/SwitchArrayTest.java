package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void swap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(result, expected);

    }

    @Test
    public void swap2To3() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 6, 4, 5, 3, 7};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void swap5To6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 5;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 7, 6, 8};
        Assert.assertArrayEquals(result, expected);
    }

}