package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI, "Закончить работу");
    }

    public void execute() {
        consoleUI.finish();
    }
}
