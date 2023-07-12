package org.example.oop.sem3.study_group.view;

import org.example.oop.sem3.study_group.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        while (work) {
            System.out.println(mainMenu.menu());
            String choice = scanner.nextLine();
            int numChoice = Integer.parseInt(choice);
            mainMenu.execute(numChoice);
        }
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    public void addStudent() {
        System.out.println("Введите имя студента");
        String name = scanner.nextLine();
        System.out.println("Введите позраст студента");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        presenter.addStudent(name, age);
    }

    public void finish() {
        System.out.println("До скорых встреч");
        work = false;
    }

    public void sortByAge() {
        presenter.sorByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentInfo() {
        presenter.getStudentInfo();
    }
}
