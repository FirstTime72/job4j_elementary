package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double arg1 = x2 - x1;
        double arg2 = y2 - y1;
        double arg3 = Math.pow(arg1, 2);
        double arg4 = Math.pow(arg2, 2);
        double arg5 = arg3 + arg4;
        double arg6 = Math.sqrt(arg5);
        return arg6;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 2, 4, 5);
        double result3 = Point.distance(3, 2, 48, 12);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result2 (2, 2) to (4, 5) " + result2);
        System.out.println("result3 (3, 2) to (48, 12) " + result3);
    }
}