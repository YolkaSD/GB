package org.example.algorithms.lec2;
import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = Sort.fillArr(100);
        Sort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(find(arr, 5));
        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
    }

    //O(n)
    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    //O(log n)
    public static int binarySearch(int[] arr, int value, int min, int max) {
        if (max < min) {
            return -1;
        }
        int midpoint = (max - min) / 2 + min;
        if (arr[midpoint] < value) {
            return binarySearch(arr, value, midpoint + 1, max);
        } else if (arr[midpoint] > value) {
            return binarySearch(arr, value, min, midpoint - 1);
        } else {
            return midpoint;
        }
    }
}
