package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println(" result (0, 0) to (2, 0) " + result);
        double rsl = Point.distance(1, 1, 3, 1);
        System.out.println(" result (1, 1) to (3, 1) " + rsl);
        double rsl1 = Point.distance(4, 4, 5, 4);
        System.out.println(" result (4, 4) to (5, 4) " + rsl1);
        double rsl2 = Point.distance(5, 3, 8, 2);
        System.out.println(" result (5, 3) to (8, 2) " + rsl2);
    }
}
