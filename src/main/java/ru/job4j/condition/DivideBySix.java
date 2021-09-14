package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2  == 0) {
                 rsl = "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 == 0) {
                rsl = "Исходное число не делится на 3, но является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return rsl;

    }

    public static void main(String[] args) {
        String rsl = DivideBySix.checkNumber(24);
        System.out.println(rsl);
        String rsl1 = DivideBySix.checkNumber(9);
        System.out.println(rsl1);
        String rsl2 = DivideBySix.checkNumber(14);
        System.out.println(rsl2);
        String rsl3 = DivideBySix.checkNumber(25);
        System.out.println(rsl3);
    }
}
