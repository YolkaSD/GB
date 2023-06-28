package org.example.oop.sem1.family_tree;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Human human100 = new Human("Анна Иванова", Gender.Female, LocalDate.of(1970, 1, 1)); //Мать
        human100.addChild(new Human("Иван Иванов", Gender.Male, LocalDate.of(1998, 3, 5))); // ребенок 1
        human100.addChild(new Human("Николай Иванов", Gender.Male, LocalDate.of(1998, 2, 20))); // ребенок 2
        human100.addChild(new Human("Людмила Иванова", Gender.Female, LocalDate.of(1992, 12, 5)));  // ребенок 3

        Human human110 = human100.getChild(0);
        human110.addChild(new Human("Петр Иванов", Gender.Male, LocalDate.of(2020, 12, 10)));
        human110.addChild(new Human("Елена Иванова", Gender.Female, LocalDate.of(2021, 6, 20)));
        human110.addChild(new Human("Алексей Иванов", Gender.Male, LocalDate.of(2022, 9, 5)));

        Human human120 = human110.getChild(1);
        System.out.println(human120);
        Human human130 = human100.getChild(2);


        Human human20 = new Human("Мария Смирнова", Gender.Female, LocalDate.of(1975, 9, 10));
        Human human30 = new Human("Николай Иванов", Gender.Male, LocalDate.of(1978, 2, 20));
        Human human40 = new Human("Людмила Иванова", Gender.Female, LocalDate.of(1982, 12, 5));

        FamilyTree familyTree = new FamilyTree();
        familyTree.addPerson(human100);

    }
}
