package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;

        };
    }

    public static void main(String[] args) {
        int rsl = MultipleSwitchWeek.numberOfDay("Понедельник");
        System.out.println(rsl);
        int rsl1 = MultipleSwitchWeek.numberOfDay("Вторник");
        System.out.println(rsl1);
        int rsl2 = MultipleSwitchWeek.numberOfDay("Среда");
        System.out.println(rsl2);
        int rsl3 = MultipleSwitchWeek.numberOfDay("Четверг");
        System.out.println(rsl3);
        int rsl4 = MultipleSwitchWeek.numberOfDay("Пятница");
        System.out.println(rsl4);
        int rsl5 = MultipleSwitchWeek.numberOfDay("Суббота");
        System.out.println(rsl5);
        int rsl6 = MultipleSwitchWeek.numberOfDay("Воскресенье");
        System.out.println(rsl6);
    }
}
