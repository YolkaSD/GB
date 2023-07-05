package org.example.oop.sem1.family_tree.human.sorted;

import org.example.oop.sem1.family_tree.human.Human;

import java.time.LocalDate;
import java.util.Comparator;

public class SortedByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        LocalDate dateO1 = o1.getDateBirth();
        LocalDate dateO2 = o2.getDateBirth();
        int result =  dateO1.getYear() - dateO2.getYear();
        if (result == 0) {
            result = dateO1.getMonthValue() - dateO2.getMonthValue();
            if (result == 0) {
                result = dateO1.getDayOfMonth() - dateO2.getDayOfMonth();
            }
        }
        return result;
    }

    @Override
    public Comparator<Human> reversed() {
        return Comparator.super.reversed();
    }
}
