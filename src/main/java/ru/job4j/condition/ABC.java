package ru.job4j.condition;

public class ABC {

    public static int findBiggestOfThree(int A, int B, int C) {
        return A > B ? A > C ? A : C : B > C ? B : C;
    }

    public static void main(String[] args) {
        System.out.println(findBiggestOfThree(2, 8, 6));
        System.out.println(findBiggestOfThree(10, 15, 11));
        System.out.println(findBiggestOfThree(10, 11, 20));
    }
}