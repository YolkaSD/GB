package org.example.lectureapi.sem5;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, Set<String>> contacts = new HashMap<>();
        add(contacts, "Иван", "9-232-515-123");
        add(contacts, "Иван", "9-232-515-123");
        add(contacts, "Иван", "9-232-515-125");
        add(contacts, "Илья", "9-632-525-125");
        add(contacts, "Илья", "9-632-522-125");
        add(contacts, "Илья", "9-632-732-125");
        add(contacts, "Илья", "9-632-525-721");
        System.out.println(contacts);
        print(contacts);
    }

    public static void add(Map<String, Set<String>> contacts, String name, String number) {
        Set<String> numbersSet;
        if (Objects.isNull(contacts.get(name))) {
            numbersSet = new HashSet<>();
        } else {
            numbersSet = contacts.get(name);
        }

        numbersSet.add(number);
        contacts.put(name, numbersSet);
    }

    public static void print(Map<String, Set<String>> contacts) {
        List<Map.Entry<String, Set<String>>> s = new ArrayList<>(contacts.entrySet());
        s.sort(Comparator.comparingInt(o -> o.getValue().size()));
        System.out.println(s);
    }
}
