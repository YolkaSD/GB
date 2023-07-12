package org.example.oop.sem1.family_tree.human;

import org.example.oop.sem1.family_tree.FamilyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface Individual extends Serializable {
    String getName();
    LocalDate getDateBirth();


}
