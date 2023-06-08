package org.example.algorithms.lecture1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> availableDivider = findAvailableDivider(12);
//        availableDivider.forEach(System.out::println);
//
//        List<Integer> simpleLists = findSimpleNumbers(12);
//        simpleLists.forEach(System.out::println);
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(15, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
    }

    public static List<Integer> findAvailableDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();

//        result = IntStream.rangeClosed(1, number)
//                .filter(n -> number % n == 0)
//                .boxed()
//                .collect(Collectors.toList());

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
            counter++;
        }
        System.out.println("(O(n) - Counter: " + counter);
        return result;
    }

    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("O(n^2) - Counter: " + counter);
        return result;
    }

    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }

        return fib(position - 1, counter) + fib(position - 2, counter);
    }
}
