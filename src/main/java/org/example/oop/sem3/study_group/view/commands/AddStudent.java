package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public class AddStudent extends Command {

    public AddStudent(ConsoleUI consoleUI) {
        super(consoleUI, "Добавить нового студента");
    }

    public void execute() {
        consoleUI.addStudent();
    }
}
