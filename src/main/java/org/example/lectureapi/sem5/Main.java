package org.example.lectureapi.sem5;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> age = new ArrayList<>();
//        List<Integer> id = new ArrayList<>();
//        age.add(4);
//        age.add(7);
//        age.add(2);
//        age.add(8);
//        age.add(3);
//
//        id.add(0);
//        id.add(1);
//        id.add(2);
//        id.add(3);
//        id.add(4);
//
//        id.sort((Comparator.comparingInt(age::get)));
//
//        System.out.println(id);

        Map<Integer, Integer> dict = new HashMap<>();
        IntStream.rangeClosed(0, 5).forEach(i -> dict.put(i, new Random().nextInt(100)));
        //System.out.println(dict);

//        dict.forEach((i, e) -> {
//            if (e % 3 == 0)
//                System.out.println(e);
//        });

//        dict.values().stream().filter(v -> v % 3 == 0).forEach(System.out::println);

//        for (int i : dict.values()) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        Map<Integer, String> maleName = new HashMap<>();
        Map<Integer, String> femaleName = new HashMap<>();

        Random random = new Random();


        maleName.put(random.nextInt(10), "Андрей");
        maleName.put(random.nextInt(10), "Борис");
        maleName.put(random.nextInt(10), "Виктор");
        maleName.put(random.nextInt(10), "Георгий");
        maleName.put(random.nextInt(10), "Дмитрий");

        femaleName.put(random.nextInt(10), "Анна");
        femaleName.put(random.nextInt(10), "Виктория");
        femaleName.put(random.nextInt(10), "Александра");
        femaleName.put(random.nextInt(10), "Евгения");
        femaleName.put(random.nextInt(10), "Олеся");

//        for (Integer i : maleName.keySet()) {
//            femaleName.keySet().stream().filter(e -> Objects.equals(i, e)).forEach(e -> System.out.println(maleName.get(e) + " " + femaleName.get(e)));
//        }

//        maleName.entrySet().forEach(entry -> {
//            Integer key = entry.getKey();
//            String mName = entry.getValue();
//            String fName = femaleName.get(key);
//            if (Objects.nonNull(fName)) {
//                System.out.println(mName + " " + fName);
//            }
//        });

//        System.out.println(femaleName);
//        System.out.println(maleName);

//        maleName.forEach((key, mName) -> {
//            String fName = femaleName.get(key);
//            if (Objects.nonNull(fName)) {
//                System.out.println(mName + " " + fName);
//            }
//        });

//        for (Integer i : femaleName.keySet()) {
//            if (maleName.containsKey(i)) {
//                System.out.println(maleName.get(i) + " " + femaleName.get(i));
//            }
//        }

        Map<Integer, Integer> dict2 = new HashMap<>();
        IntStream.rangeClosed(0, 10).forEach(i -> dict2.put(i, random.nextInt(10)));
        dict2.forEach((key, value) -> System.out.println("[ " + key + " : " + Math.pow(value, 2) + " ]"));
    }
}