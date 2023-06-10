package org.example.algorithms.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //calculateSumUpToN(10);
        //findPrimeNumbersUpToN(100);
        //sieveOfEratosthenes(100);
        //calculateAllCombinations(4, 6);
        //calculateAllCombinationsG(4, 6);
        //fib();
        System.out.println(Arrays.toString(fibArr(1000)));

    }

    // O(n)
    public static void calculateSumUpToN(int number) {
//        int result = 1;
//        for (int i = 2; i <= number; i++) {
//            result += i;
//        }
//        System.out.println(result);

        int result = IntStream.rangeClosed(1, number).sum();
        System.out.println(result);
    }

    //O(n^2)
    public static void findPrimeNumbersUpToN(int n) {
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }

    //O(N log log N)
    public static void sieveOfEratosthenes(int number) {
        // Создаем массив для отметки простых чисел
        boolean[] isPrime = new boolean[number + 1];
        Arrays.fill(isPrime, true);

        List<Integer> primes = new ArrayList<>();

        // 0 и 1 не являются простыми числами
        isPrime[0] = false;
        isPrime[1] = false;

        // Просеиваем числа от 2 до n
        for (int i = 2; i * i <= number; i++) {
            // Если число i является простым, помечаем все его кратные как составные числа
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }

    public static void calculateAllCombinations(int count, int faces) {
        System.out.println(recursiveCalculateAllCombinations(1, count, faces));
    }

    //O(faces^count) - экспоненциальная сложность
    public static int recursiveCalculateAllCombinations(int countNow, int maxCount, int faces) {
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (countNow == maxCount) {
                count++;
            } else {
                count += recursiveCalculateAllCombinations(countNow + 1, maxCount, faces);
            }
        }
        return count;
    }

    public static void calculateAllCombinationsG(int count, int faces) {
        // Проверяем входные параметры
        if (count <= 0 || faces <= 0) {
            throw new IllegalArgumentException("Количество кубиков и количество граней должны быть положительными числами");
        }

        // Используем формулу комбинаторики: количество комбинаций = N^K
        int combinations = (int) Math.pow(count, faces);
        System.out.println(combinations);
    }

    public static void fib() {
        int n = 10;
        System.out.println(recursiveFib(n));
    }

    public static int recursiveFib(int n) { // O(2^n)
        if (n <= 2) {
            return 1;
        } else {
            return recursiveFib(n - 1) + recursiveFib(n - 2);
        }
    }

    public static int[] fibArr(int n) { // O(n)
        int[] numbers = new int[n];
        numbers[0] = 1;
        numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        return numbers;
    }

}
