package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public abstract class Command {
    ConsoleUI consoleUI;
    String description;

    public Command(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
