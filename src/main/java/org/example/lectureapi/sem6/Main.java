package org.example.lectureapi.sem6;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> myHashSet = new MyHashSet<>();
        myHashSet.add("Hello");
        myHashSet.add("Sun");
        myHashSet.add("First");

        myHashSet.add("Hello");
        myHashSet.add("Hello");
        myHashSet.add("Hello");
        System.out.println(myHashSet);
        myHashSet.remove("Hello");
        System.out.println(myHashSet);
    }
}
