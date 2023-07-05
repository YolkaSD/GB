package org.example.oop.sem1.family_tree;

import org.example.oop.sem1.family_tree.human.Human;

import java.util.Iterator;
import java.util.List;

public class ThreeIterator implements Iterator<Human> {
    private int index;
    private final List<Human> humanList;

    public ThreeIterator(List<Human> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return index < humanList.size();
    }

    @Override
    public Human next() {
        return humanList.get(index++);
    }
}
