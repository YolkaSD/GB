package org.example.lectureapi.sem2;

public class Test {
    public static void main(String[] args) {
//        String str = "a".repeat(111000);
//        StringBuilder stringBuilder = new StringBuilder(str);
//
//        long start = System.currentTimeMillis();
//        str = str.replace("a", "A");
//        System.out.println("time String = " + (System.currentTimeMillis() - start));
//
//        start = System.currentTimeMillis();
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            stringBuilder.setCharAt(i, 'A');
//        }
//        System.out.println("time StringBuilder = " + (System.currentTimeMillis() - start));

        String s = ".3 + 1.56 = ";
        String[] exp = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append(Double.parseDouble(exp[0]) + Double.parseDouble(exp[2]));
        System.out.println(stringBuilder);
    }
}
