package com.syncretis;

public interface Sorter {
    void sort(int[] array);

    default void swap(int firstEl, int secondEl, int[] array) {
        int temp = array[firstEl];
        array[firstEl] = array[secondEl];
        array[secondEl] = temp;
    }
}
