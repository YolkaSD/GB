package org.example.oop.sem3.study_group;

import org.example.oop.sem3.study_group.model.service.Service;
import org.example.oop.sem3.study_group.view.ConsoleUI;
import org.example.oop.sem3.study_group.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
