package org.example.oop.sem1.family_tree;

import java.util.*;

public class FamilyTree {
    private List<Human> humanList;

    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    public void addPerson(Human human) {
        humanList.add(human);
    }

    public List<Human> getAllHuman() {
        List<Human> allHuman = new ArrayList<>();
        humanList.forEach(human -> {
            Queue<Human> deque = new ArrayDeque<>();
            deque.add(human);
            while (!deque.isEmpty()) {
                Human currentHuman = deque.poll();
                deque.addAll(currentHuman.getChildren());
                allHuman.add(currentHuman);
            }
        });

        return allHuman;
    }

}
