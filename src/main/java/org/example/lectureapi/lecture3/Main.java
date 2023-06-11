package org.example.lectureapi.lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sum(1, 2));
//        System.out.println(sum(1.2, 2.6));
//        System.out.println(sum(1, 2.6));
//        System.out.println(sum(1.2, 2));
//        int[] a = new int[] {1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);
//
//        for (int i : a) {
//            System.out.printf("%d ", i);
//        }
//        System.out.println();
//        for (int i : b) {
//            System.out.printf("%d ", i);
//        }
//    }

//    public static Object sum(Object a, Object b) {
//        if (a instanceof  Double && b instanceof  Double) {
//            return (Double) a + (Double) b;
//        } else if (a instanceof  Integer && b instanceof Integer) {
//            return (Integer) a + (Integer) b;
//        } else if (a instanceof Double && b instanceof Integer) {
//            return (Double) a + (Integer) b;
//        } else if (a instanceof Integer && b instanceof Double){
//            return (Integer) a + (Double) b;
//        } else return 0;
//    }

//    public static Number sum(Number a, Number b) {
//        return a.doubleValue() + b.doubleValue();
//    }

//    public static Integer sum(Number a, Number b) {
//        return a.intValue() + a.intValue();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12321);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
