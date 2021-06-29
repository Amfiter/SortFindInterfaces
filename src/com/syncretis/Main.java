package com.syncretis;

import com.syncretis.Interfaces.Searcher;
import com.syncretis.Interfaces.Sorter;
import com.syncretis.Search.BinarySearch;
import com.syncretis.Search.LinearSearch;
import com.syncretis.Sort.BubbleSort;
import com.syncretis.Sort.QuickSort;
import com.syncretis.Sort.SelectionSort;

import java.util.Arrays;

public class Main {
    static int index = 10;

    public static void main(String[] args) {

        for (int i = 0; i < 3; ++i) {
            Sorter bubble = new BubbleSort();
            Sorter selective = new SelectionSort();
            Sorter quick = new QuickSort();
            Searcher linear = new LinearSearch();
            Searcher binary = new BinarySearch();
            int[] array = CreateArray.arrayFilling(index);
            int unknownNumber = Random.RandomNumber(array.length);
            System.out.println("Заданный рандомный индекс: " + unknownNumber);

            int[] unsortableArray = array.clone();
            int[] unsortableArraySelective = array.clone();
            int[] unsortableArrayQuick = array.clone();

            bubble.sort(unsortableArray);
            selective.sort(unsortableArraySelective);
            quick.sort(unsortableArrayQuick);

            linear.search(unsortableArray, unknownNumber);
            binary.search(unsortableArray, unknownNumber);

            System.out.println("сортировка пузырьком " + Arrays.toString(unsortableArray));
            System.out.println("сортировка выбором " + Arrays.toString(unsortableArraySelective));
            System.out.println("быстрая сортировка " + Arrays.toString(unsortableArrayQuick));
            System.out.println("========================================================");
            index *= 10;
        }
    }

}