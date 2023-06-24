package org.example.lectureapi.sem6;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet<T> {
    private List<T> arrayList;

    public MyHashSet() {
        arrayList = new ArrayList<>();
    }

    public boolean add(T value) {
        if (arrayList.contains(value)) {
            return false;
        }
        return arrayList.add(value);
    }

    public boolean remove(T value) {
        return arrayList.remove(value);
    }

    public int size() {
        return arrayList.size();
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "arrayList=" + arrayList +
                '}';
    }
}
