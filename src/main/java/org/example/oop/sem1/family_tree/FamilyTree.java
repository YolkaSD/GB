package org.example.oop.sem1.family_tree;

import org.example.oop.sem1.family_tree.human.Human;
import org.example.oop.sem1.family_tree.human.HumanIterator;
import org.example.oop.sem1.family_tree.human.sorted.SortedByAge;
import org.example.oop.sem1.family_tree.human.sorted.SortedByNameDown;
import org.example.oop.sem1.family_tree.human.sorted.SortedByNameUp;

import java.util.*;

public class FamilyTree implements Iterable<Human>{
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

    public String printAllHumans() {
        StringBuilder stringInfoBuild = new StringBuilder("Все люди дерева \n");
        for (Human human : this) {
            stringInfoBuild.append(human).append("\n");
        }
        return stringInfoBuild.toString();
    }

    public void sortedByNameUp() {
        Collections.sort(humanList, new SortedByNameUp());
    }

    public void sortedByNameDown() {
        Collections.sort(humanList, new SortedByNameDown());
    }

    public void sortedByDateBirthUp() {
        humanList.sort(new SortedByAge());
    }

    public void sortedByDateBirthDown() {
        humanList.sort(new SortedByAge().reversed());
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(humanList);
    }

}
