package org.example.oop.sem1.family_tree.IO;

import org.example.oop.sem1.family_tree.human.Human;
import org.example.oop.sem1.family_tree.human.Individual;

import java.io.Serializable;
import java.util.List;

public interface Writable<T extends Individual> extends Serializable {
    void writeToFile();
    List<T> readFromFile();
}
