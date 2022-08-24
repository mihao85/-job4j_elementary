package ru.job4j;

import ru.job4j.math.MathFunction;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second);
    }

    public static double sumSumAndMultiply(double first, double second) {
        return MathFunction.contrast(first, second) + MathFunction.division(first, second);
    }

    public static double sumDelAndMultiply(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.multiply(first, second) + MathFunction.contrast(first, second) + MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(80, 20));
        System.out.println("Результат расчета равен: " + sumSumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDelAndMultiply(10, 20));
    }
}