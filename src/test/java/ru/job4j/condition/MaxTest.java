package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
    int left = 1;
    int right = 2;
    int result = Max.max(left, right);
    int expected = 2;
    Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To3Then9() {
        int left = 9;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To22Then22() {
        int left = 4;
        int right = 22;
        int result = Max.max(left, right);
        int expected = 22;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To6Then6() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}