package com.sparta.codeKataExercises;

import java.util.Arrays;

public class SecondLarNumCalcEx {
    public static void main(String[] args) {
        int[] array = {552, 487, 925, 288, 199};
        Arrays.sort(array);
        System.out.println(array[array.length -2]);
    }
}
