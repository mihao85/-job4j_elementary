package ru.job4j.ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double perimetr = a + b + c;
        double rsl = Math.sqrt(((perimetr) / 2) * (((perimetr) / 2) - a) * (((perimetr) / 2) - b) * (((perimetr) / 2) - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
