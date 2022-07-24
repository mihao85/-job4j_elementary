package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumSamAndMultiply(double first, double second) {

        return raz(first, second) + del(first, second);
    }

    public static double delSumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second) + raz(first, second) + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(200, 20));
        System.out.println("Результат расчета равен: " + sumSamAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + delSumAndMultiply(10, 20));
    }

}