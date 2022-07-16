package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double s = TrgArea.area(2, 2, 2);
        double s2 = TrgArea.area(5, 16, 12);
        System.out.println("area (2, 2, 2) = " + s);
        System.out.println(" area (5, 16, 12) = " + s2);
    }
}
