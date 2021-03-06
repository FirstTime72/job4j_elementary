package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float dollar = Converter.rubleToDollar(600);
        in = 600;
        expected = 10;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("600 rubles are " + dollar + " dollar.");
        System.out.println("140 rubles are 2. Test result - : " + passed);
        System.out.println("600 rubles are 10. Test result - : " + passed);

    }
}
