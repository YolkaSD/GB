package org.example.oop.sem1.family_tree;

import org.example.oop.sem1.family_tree.human.Individual;
import org.example.oop.sem1.family_tree.human.sorted.SortedByAge;
import org.example.oop.sem1.family_tree.human.sorted.SortedByNameDown;
import org.example.oop.sem1.family_tree.human.sorted.SortedByNameUp;

import java.util.*;

public class FamilyTree<T extends Individual> implements Iterable<T> {
    private final List<T> humanList;

    public FamilyTree() {
        this.humanList = new ArrayList<>();
    }

    public void addPerson(T t) {
        humanList.add(t);
    }

    public List<T> getAllHuman() {
        return humanList;
    }

    public String printAllHumans() {
        StringBuilder stringInfoBuild = new StringBuilder("Все люди дерева \n");
        for (T human : this) {
            stringInfoBuild.append(human).append("\n");
        }
        return stringInfoBuild.toString();
    }

    public void sortedByNameUp() {
        humanList.sort(new SortedByNameUp<>());
    }

    public void sortedByNameDown() {
        humanList.sort(new SortedByNameDown<>());
    }

    public void sortedByDateBirthUp() {
        humanList.sort(new SortedByAge<>());
    }

    public void sortedByDateBirthDown() {
        humanList.sort(new SortedByAge<>().reversed());
    }

    @Override
    public Iterator<T> iterator() {
        return new TreeIterator<>(humanList);
    }

}
