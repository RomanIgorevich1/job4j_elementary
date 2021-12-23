package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDiv(double one, double two) {
        return minus(one, two) + div(one, two);
    }

    public static double totalSum(double first, double second, double one, double two) {
        return  sumAndMultiply(first, second) + minusAndDiv(one, two);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен " + minusAndDiv(60, 30));
        System.out.println("Результат расчета равен " + totalSum(10, 20, 60, 30));
    }
}
