package org.example.algorithms.lec2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = Sort.fillArr(100);
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int startPosition, int endPosition) {
        int low = startPosition;
        int high = endPosition;
        int pivot = arr[(startPosition + endPosition) / 2];

        do {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {
                if (low < high) {
                    int temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                }
                low++;
                high--;
            }
        } while (low <= high);

        if (low < endPosition) {
            sort(arr, low, endPosition);
        }

        if (startPosition < high) {
            sort(arr, startPosition, high);
        }
    }
}

