package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива равен " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен " + prices.length);
        String[] names = new String[4];
        names[0] = "Роман";
        System.out.println(names[0]);
        names[1] = "Игорь";
        System.out.println(names[1]);
        names[2] = "Светлана";
        System.out.println(names[2]);
        names[3] = "Вероника";
        System.out.println(names[3]);
    }

}

