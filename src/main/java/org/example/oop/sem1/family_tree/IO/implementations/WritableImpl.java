package org.example.oop.sem1.family_tree.IO.implementations;

import org.example.oop.sem1.family_tree.FamilyTree;
import org.example.oop.sem1.family_tree.Human;
import org.example.oop.sem1.family_tree.IO.interfaces.Writable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WritableImpl implements Writable {

    private FamilyTree familyTree;

    public WritableImpl(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    @Override
    public void writeToFile() {
        File file = new File("src/main/resources/familyTree.out");
        try (ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream(file))) {
            List<Human> humans = familyTree.getAllHuman();
            for (Human human : humans) {
                outputStream.writeObject(human);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Human> readFromFile() {
        File file = new File("src/main/resources/familyTree.out");
        List<Human> humans = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))){
            while (true) {
                try {
                    humans.add((Human) inputStream.readObject());
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
