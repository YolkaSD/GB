package org.example.oop.sem1.family_tree.human.sorted;

import org.example.oop.sem1.family_tree.human.Human;
import org.example.oop.sem1.family_tree.human.Individual;

import java.util.Comparator;

public class SortedByNameDown<T extends Individual> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
