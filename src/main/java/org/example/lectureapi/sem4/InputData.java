package org.example.lectureapi.sem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        String firstNameString = "First name: ";
        String lastNameString = "Last name: ";
        String genderString = "Gender: ";
        String ageString = "Age: ";
        Scanner scanner = new Scanner(System.in);
        System.out.print(firstNameString);
        name.append(firstNameString).append(scanner.next()).append(", ");
        System.out.print(lastNameString);
        name.append(lastNameString).append(scanner.next()).append(", ");
        System.out.print(genderString);
        name.append(genderString).append(scanner.next()).append(", ");
        System.out.print(ageString);
        name.append(ageString).append(scanner.next()).append(", ");
        List<String> namesList = new ArrayList<>();
        namesList.add(name.toString());
        System.out.println(namesList);
        namesList.clear();

    }
}
