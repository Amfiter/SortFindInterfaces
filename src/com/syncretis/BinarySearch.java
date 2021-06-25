package com.syncretis;

public class BinarySearch implements Searcher {
    @Override
    public void search(int[] array, int elementToSearch) {
        BinarySearch(array, elementToSearch);
        System.out.println("число которое искали,бинарного поиска" + BinarySearch(array, elementToSearch));
    }

    public static int BinarySearch(int array[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == elementToSearch)
                return array[middleIndex];

            else if (array[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (array[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }
}
