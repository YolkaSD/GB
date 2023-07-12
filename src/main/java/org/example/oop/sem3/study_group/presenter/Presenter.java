package org.example.oop.sem3.study_group.presenter;
import org.example.oop.sem3.study_group.model.service.Service;
import org.example.oop.sem3.study_group.view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addStudent(String name, int age) {
        service.addStudent(name, age);
        getStudentInfo();
    }

    public void getStudentInfo() {
        view.printAnswer(service.getStudentsInfo());
    }

    public void sortByName() {
        service.sortByName();
        getStudentInfo();
    }

    public void sorByAge() {
        service.sortByAge();
        getStudentInfo();
    }
}
