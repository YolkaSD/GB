package org.example.oop.sem3.study_group.view.commands;

import org.example.oop.sem3.study_group.view.ConsoleUI;

public class SortByAge extends Command{
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI, "Отсортировать по возрасту");
    }

    public void execute() {
        consoleUI.sortByAge();
    }
}
