package org.example.oop.sem3.study_group.service;

import org.example.oop.sem3.study_group.group.StudyGroup;
import org.example.oop.sem3.study_group.student.Student;

public class Service {
    private int idStudent;
    private StudyGroup<Student> group;

    public Service() {
        group = new StudyGroup<>();
    }

    public void addStudent(String name, int age) {
        Student student = new Student(idStudent++, name, age);
        group.addStudent(student);
    }

    public String getStudentsInfo() {
        StringBuilder stringBuilder = new StringBuilder("Список студентотв: \n");

        for (Student student : group) {
            stringBuilder.append(student).append("\n");
        }

        return stringBuilder.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }
}
