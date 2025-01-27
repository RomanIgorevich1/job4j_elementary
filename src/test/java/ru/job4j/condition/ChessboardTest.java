package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class ChessboardTest {

    @Test
    public void wayIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int expected = 5;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void wayIs7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int expected = 7;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void wayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int expected = 0;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int expected = 0;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = -1;
        int y2 = 1;
        int expected = 0;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = -1;
        int expected = 0;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int x1 = 10;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int expected = 0;
        int rsl = Chessboard.way(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl);

    }
}
