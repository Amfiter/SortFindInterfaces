package com.syncretis;

import com.syncretis.Interfaces.Sorter;

public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    swap(j-1,j,array);
                }
            }
        }
    }
}
