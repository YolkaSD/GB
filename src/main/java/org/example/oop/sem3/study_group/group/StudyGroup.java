package org.example.oop.sem3.study_group.group;

import org.example.oop.sem3.study_group.student.Student;
import org.example.oop.sem3.study_group.student.StudentIterator;
import org.example.oop.sem3.study_group.student.comparators.StudentComparatorByAge;
import org.example.oop.sem3.study_group.student.comparators.StudentComparatorByName;

import java.util.*;

public class StudyGroup<E extends GroupItem> implements Iterable<E>{
    private List<E> studentList;

    public StudyGroup() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(E e) {
        studentList.add(e);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName() {
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge() {
        studentList.sort(new StudentComparatorByAge<>());
    }

}
