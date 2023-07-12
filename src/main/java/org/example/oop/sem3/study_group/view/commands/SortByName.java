package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public class SortByName extends Command{

    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI, "Отсортировать по имени");
    }

    public void execute() {
        consoleUI.sortByName();
    }
}
