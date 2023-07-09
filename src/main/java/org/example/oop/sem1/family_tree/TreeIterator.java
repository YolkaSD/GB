package org.example.oop.sem1.family_tree;

import org.example.oop.sem1.family_tree.human.Individual;

import java.util.Iterator;
import java.util.List;

public class TreeIterator<T extends Individual> implements Iterator<T> {
    private int index;
    private final List<T> humanList;

    public TreeIterator(List<T> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public T next() {
        return humanList.get(index++);
    }
}
