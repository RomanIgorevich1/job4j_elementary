package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;

        for (int rsl = start; rsl <= finish; rsl++) {
            sum = sum + rsl;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

    }
}


