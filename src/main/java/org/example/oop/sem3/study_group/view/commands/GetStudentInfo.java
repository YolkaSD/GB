package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public class GetStudentInfo extends Command{
    public GetStudentInfo(ConsoleUI consoleUI) {
        super(consoleUI, "Получить информацию");
    }

    public void execute() {
        consoleUI.getStudentInfo();
    }
}
