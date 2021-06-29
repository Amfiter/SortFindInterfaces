package com.syncretis;

import static java.lang.Math.random;

public class CreateArray {
    public static int[] arrayFilling(int index) {
        System.out.printf("Размер массива: %d\n", index);
        int[] array = new int[index];
        for (int i = 0; i < array.length; ++i) {
            array[i] = Random(0, index);
        }
        return array;
    }

    public static int Random(int startDiap, int endDiap) {
        int randomIndex = startDiap + (int) (random() * endDiap);
        return randomIndex;
    }
}