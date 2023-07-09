package org.example.oop.sem1.family_tree.human.sorted;

import org.example.oop.sem1.family_tree.human.Human;
import org.example.oop.sem1.family_tree.human.Individual;

import java.util.Comparator;

public class SortedByNameUp<T extends Individual> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
