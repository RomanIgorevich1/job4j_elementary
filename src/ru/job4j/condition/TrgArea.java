package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c){
        double p = (a + b + c) / 2;
        double one = (p - a) * (p - b) * (p - c);
        double two = p * one;
        return Math.sqrt(two);


    }

    public static void main(String[] args){
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
