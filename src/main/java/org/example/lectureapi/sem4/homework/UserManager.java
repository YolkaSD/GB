package org.example.lectureapi.sem4.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UserManager {
    private final List<UserDTO> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void userAdd(UserDTO user) {
        users.add(user);
    }

    public void printFormattedUser() {
        for(UserDTO user: users) {
            System.out.println(user.getFormattedInfo());
        }
    }

    public void sortByAge() {
        users.sort(Comparator.comparingInt(UserDTO::getAge));
    }

    public void sortByAgeAndGender() {
        users.sort(Comparator.comparingInt(UserDTO::getAge).thenComparing(UserDTO::getGender));
    }
}
