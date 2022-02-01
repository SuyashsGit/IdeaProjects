package com.sparta.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummerTest {
    @Test

    public void testSumArray(int[] a){
        int[] x = {1, 2, 3, 4, 5};

        Summer sumTest = new Summer();

        int actual = sumTest.sumArray(x);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }
}
