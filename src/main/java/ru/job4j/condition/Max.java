package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int rsl = ru.job4j.condition.Max.max(5, 10);
        System.out.println(rsl);
        int rsl1 = ru.job4j.condition.Max.max(8, 3);
        System.out.println(rsl1);
        int rsl3 = ru.job4j.condition.Max.max(5, 5);
        System.out.println(rsl3);
    }
}
