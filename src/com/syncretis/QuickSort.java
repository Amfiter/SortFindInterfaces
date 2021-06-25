package com.syncretis;

public class QuickSort implements Sorter {

    @Override
    public void sort(int[] array) {
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    private void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int supportElement = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < supportElement) {
                i++;
            }
            while (array[j] > supportElement) {
                j--;
            }
            if (i <= j) {
                swap(i, j, array);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
