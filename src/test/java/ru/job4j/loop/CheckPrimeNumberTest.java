package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean rsl = CheckPrimeNumber.check(number);
        Assert.assertTrue(rsl);

    }

    @Test
    public void when4() {
        int number = 4;
        boolean rsl = CheckPrimeNumber.check(number);
        Assert.assertFalse(rsl);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean rsl = CheckPrimeNumber.check(number);
        Assert.assertFalse(rsl);
    }

}