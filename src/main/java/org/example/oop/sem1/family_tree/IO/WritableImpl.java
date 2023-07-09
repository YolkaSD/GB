package org.example.oop.sem1.family_tree.IO;

import org.example.oop.sem1.family_tree.FamilyTree;
import org.example.oop.sem1.family_tree.human.Human;
import org.example.oop.sem1.family_tree.human.Individual;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WritableImpl<T extends Individual> implements Writable {

    private FamilyTree<T> familyTree;

    public WritableImpl(FamilyTree<T> familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public void writeToFile() {
        File file = new File("src/main/resources/familyTree.out");
        try (ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream(file))) {
            List<T> humans = familyTree.getAllHuman();
            for (T human : humans) {
                outputStream.writeObject(human);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<T> readFromFile() {
        File file = new File("src/main/resources/familyTree.out");
        List<T> humans = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            while (true) {
                try {
                    humans.add((T) inputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            throw  new RuntimeException(e);
        }

        return humans;
    }
}
