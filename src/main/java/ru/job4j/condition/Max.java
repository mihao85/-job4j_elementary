package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : left == right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int maxi = Max.max(2, 3);
        System.out.println(maxi);
    }
}
