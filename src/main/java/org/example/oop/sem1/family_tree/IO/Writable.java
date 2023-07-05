package org.example.oop.sem1.family_tree.IO;

import org.example.oop.sem1.family_tree.human.Human;

import java.io.Serializable;
import java.util.List;

public interface Writable extends Serializable {
    void writeToFile();
    List<Human> readFromFile();
}
