package org.example.algorithms.sem2;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] integers = IntStream.rangeClosed(0, 100).map(i -> new Random().nextInt(100)).toArray();
        System.out.println(Arrays.toString(integers));
        quickSort(integers);
        System.out.println(Arrays.toString(integers));
    }

    public static void quickSort(int[] array) {
        quickSortRecursive(array, 0, array.length - 1);
    }
    public static void quickSortRecursive(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];

        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }

            while (array[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSortRecursive(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortRecursive(array, leftBorder, rightMarker);
        }

    }
}
