package org.example.oop.sem1.family_tree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private List<Human> humanList;

    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    public void addPerson(Human human) {
        humanList.add(human);
    }

}
