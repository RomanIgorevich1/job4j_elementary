package ru.job4j.calculator;

    public class Fit {

        public static double manWeight(short height) {
            return (height - 100) * 1.15;
        }

        public static double womenWeight(short height) {
            return (height - 110) * 1.15;
        }

        public static void main(String[] args) {
            short height = 174;
            short height1 = 167;
            double man = Fit.manWeight(height);
            double women = Fit.womenWeight(height1);
            System.out.println("Man 174 is " + man);
            System.out.println("Women 167 is " + women);
        }
    }
