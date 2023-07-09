package org.example.oop.sem3.study_group.student.comparators;

import org.example.oop.sem3.study_group.group.GroupItem;
import org.example.oop.sem3.study_group.student.Student;

import java.util.Comparator;

public class StudentComparatorByAge<E extends GroupItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getAge() - o2.getAge();
    }
}
