package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBoarder(int[] array) {
        int temp = array[0];
        array[0] = array[5];
        array[5] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] num = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBoarder(num);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }

    }
}
