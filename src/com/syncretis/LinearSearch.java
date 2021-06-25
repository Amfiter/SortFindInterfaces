package com.syncretis;

public class LinearSearch implements Searcher {
    @Override
    public void search(int[] array, int elementToSearch) {
        linearSearch(array, elementToSearch);
        System.out.println("число которое искали,линейного поиска" + linearSearch(array, elementToSearch));
    }

    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return array[i];
            }
        }
        return -1;
    }
}
