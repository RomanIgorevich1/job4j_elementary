package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
      return (ab + ac > bc && bc + ac > ab && ab + bc > ac);
    }
}
