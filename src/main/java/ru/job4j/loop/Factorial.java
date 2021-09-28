package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        int f;
        for (f = 1; f <= n; f++) {

            result = result * f;
        }
        return result;
    }

}
