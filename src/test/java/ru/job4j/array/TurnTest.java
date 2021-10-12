package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void whenTurnArrayEvenAmount() {
        int[] input = {9, 8, 7, 6, 5, 4};
        int[] expected = {4, 5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayNotEvenAmount() {
        int[] input = {3, 4, 5, 6, 7, 8, 9};
        int[] expected = {9, 8, 7, 6, 5, 4, 3};
        int[] result = Turn.back(input);
        Assert.assertArrayEquals(expected, result);
    }
}