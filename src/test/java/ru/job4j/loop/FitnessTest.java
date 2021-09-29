package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int rsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int rsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenIvanLessByFewNik() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int rsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenIvanEqualsNik() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int rsl = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, rsl);
    }
}