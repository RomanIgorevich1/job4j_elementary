package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day)  {
            case 1 :
                name = "Понедельник";
                break;
            case 2 :
                name = "Вторник";
                break;

            case 3 :
                name = "Среда";
                break;

            case 4 :
                name = "Четверг";
                break;

            case 5 :
                name = "Пятница";
                break;

            case 6 :
                name = "Суббота";
                break;
            case 7 :
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";

        }
        return name;
    }

    public static void main(String[] args) {
        String rsl = SwitchWeek.nameOfDay(1);
        System.out.println(rsl);
        String rsl2 = SwitchWeek.nameOfDay(2);
        System.out.println(rsl2);
        String rsl3 = SwitchWeek.nameOfDay(3);
        System.out.println(rsl3);
        String rsl4 = SwitchWeek.nameOfDay(4);
        System.out.println(rsl4);
        String rsl5 = SwitchWeek.nameOfDay(5);
        System.out.println(rsl5);
        String rsl6 = SwitchWeek.nameOfDay(6);
        System.out.println(rsl6);
        String rsl7 = SwitchWeek.nameOfDay(7);
        System.out.println(rsl7);
        String rsl8 = SwitchWeek.nameOfDay(8);
        System.out.println(rsl8);
    }
}
