package org.example.oop.sem1.family_tree.human.sorted;

import org.example.oop.sem1.family_tree.human.Human;

import java.util.Comparator;

public class SortedByNameDown implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
