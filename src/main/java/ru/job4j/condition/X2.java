package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
       int rsll = a * x * x + b * x + c;
        return rsll;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int rsl = X2.calc(a, b, c, x);
        System.out.println(rsl);
    }

}
