package org.example.oop.sem1.family_tree.human;

import org.example.oop.sem1.family_tree.FamilyTree;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Human implements Serializable {
    private String name;
    private Gender gender;
    private LocalDate dateBirth;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, Gender gender, LocalDate dateBirth) {
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
        children = new ArrayList<>();
    }

    public void addChild(Human child, FamilyTree familyTree) {
        children.add(child);
        if (this.getGenderInfo().equals("Female")) {
            child.setMother(this);
        } else {
            child.setFather(this);
        }
        familyTree.addPerson(child);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public Human getChild(int index) {
        return children.get(index);
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String getGenderInfo() {
        return gender.name();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "Имя: '" + name + '\'' +
                ", Пол: " + gender.name() +
                ", Дата рождения: " + dateBirth;
    }
}
