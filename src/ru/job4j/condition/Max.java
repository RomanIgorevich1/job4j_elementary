package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
      return left > right ? 5 : 10;
    }

    public static int min(int left, int right) {
        return left > right ? 8 : 3;

    }

    public static int middle(int left, int right) {
        return left >= right ? 5 : 5;
    }

    public static void main(String[] args) {
        int rsl = Max.max(5, 10);
        System.out.println(rsl);
        int rsl1 = Max.min(8, 3);
        System.out.println(rsl1);
        int rsl3 = Max.middle(5, 5);
        System.out.println(rsl3);

    }
}
