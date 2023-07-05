package org.example.oop.sem3.study_group;

import org.example.oop.sem3.study_group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Саша", 18);
        service.addStudent("Маша", 17);
        service.addStudent("Паша", 22);
        service.addStudent("Даша", 25);

        System.out.println(service.getStudentsInfo());
        service.sortByName();
        System.out.println(service.getStudentsInfo());
        service.sortByAge();
        System.out.println(service.getStudentsInfo());
    }
}
