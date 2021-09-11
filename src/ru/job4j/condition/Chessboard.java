package ru.job4j.condition;

public class Chessboard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 - x2 == y1 - y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        } else if (x1 > 7 && x1 < 0) {
            return rsl;
        } else if (y1 > 7 && y1 < 0) {
            return rsl;
        } else if (x2 > 7 && x2 < 0) {
            return rsl;
        } else if (y2 > 7 && y2 < 0) {
            return rsl;
        }
        return rsl;
    }

}
