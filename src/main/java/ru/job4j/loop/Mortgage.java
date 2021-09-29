package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (salary < amount || salary > amount) {
            year++;
            if (amount + ((amount * percent) / 100) - salary < 0) {
                break;
            }
            amount = (amount + ((amount * percent) / 100) - salary);
        }
        return year;

    }

}
