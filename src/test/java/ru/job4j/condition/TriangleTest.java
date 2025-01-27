package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Triangle;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 3.0;
        double bc = 3.0;
        double ac = 7.0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}