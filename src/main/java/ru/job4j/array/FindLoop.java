package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        System.out.println(indexOf(new int[]{5, 4, 3, 2}, 2));
        System.out.println(indexOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 7));
        System.out.println(indexOf(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 10));

    }

}
