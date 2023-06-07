package org.example.sem1;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(2001);
        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = 0;
        while (i > 0) {
            i >>= 1; // (тоже самое что и / 2)
            n++;
        }
        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int finN = n;
        int[] m1 = IntStream.rangeClosed(i, Short.MAX_VALUE).filter(num -> num % finN == 0).toArray();
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = IntStream.rangeClosed(Short.MIN_VALUE, i).filter(num -> num % finN != 0).toArray();
    }
}