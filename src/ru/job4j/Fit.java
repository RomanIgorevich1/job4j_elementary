package ru.job4j;

    public class Fit {

        public static double manWeight(short height){
            double rsl = (height - 100) * 1.15;
            return rsl;
        }
        public static double womenWeight(short height1){
            double rsl1 = (height1 - 110) * 1.15;
            return rsl1;
        }
        public static void main(String[] args){
            short height = 174;
            short height1 = 167;
            double man = Fit.manWeight(height);
            double women = Fit.womenWeight(height1);
            System.out.println("Man 174 is " + man);
            System.out.println("Women 167 is " + women);


        }
    }
