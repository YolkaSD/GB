package org.example.oop.sem1.family_tree.IO.interfaces;

import org.example.oop.sem1.family_tree.Human;

import java.io.Serializable;
import java.util.List;

public interface Writable extends Serializable {
    void writeToFile();
    List<Human> readFromFile();
}
