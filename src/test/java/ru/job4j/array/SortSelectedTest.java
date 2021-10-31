package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] expected = new int[] {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {9, 4, 5, 8, 12};
        int[] expected = {4, 5, 8, 9, 12};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {20, 3, 7};
        int[] expected = {3, 7, 20};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }

}