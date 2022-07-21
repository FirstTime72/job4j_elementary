package ru.job4j.condition;

public class ABC {

    public static int findBiggestOfThree(int a, int b, int c) {
        return a > b ? a > c ? a : c : b > c ? b : c;
    }

    public static void main(String[] args) {
        System.out.println(findBiggestOfThree(2, 8, 6));
        System.out.println(findBiggestOfThree(10, 15, 11));
        System.out.println(findBiggestOfThree(10, 11, 20));
    }
}