package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int num : data) {
            if (data[num] == el) {
                rsl = num;
                break;
            } else {
                return rsl;
            }
        } return rsl;
    }

}
