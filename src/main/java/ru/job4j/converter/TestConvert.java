package ru.job4j.converter;

public class TestConvert {
    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float expectedD = (float) 2.333333333333;
        float outD = Converter.rubleToDollar(in);
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles are 2. Test result : " + passedD);
    }
}
