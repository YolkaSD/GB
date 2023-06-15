package org.example.algorithms.sem2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class HeapSort {
    public static void main(String[] args) {
        int[] integers = IntStream.rangeClosed(0, 9).map(i -> new Random().nextInt(100)).toArray();
        System.out.println(Arrays.toString(integers));
        sort(integers);
        System.out.println(Arrays.toString(integers));


    }

    public static void sort(int[] array) {
        int n = array.length;

        // Построение кучи
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            heapify(array, i, n);
        }

        for (int i = n - 1; i >= 0 ; i--) {
            int tmp = array[i];
            array[i] = array[0];
            array[0] = tmp;

            heapify(array, 0, i);
        }
    }

    private static void heapify(int[] array, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (i != largest) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(array, largest, n);
        }
    }

}
