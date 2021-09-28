package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int num = 2; num <= number; num++) {
            if (num % 2 == 0) {
                prime = false;
            } else if (number % num == 0) {
                prime = true;
            }
            }
        return prime;
        }

}
