package org.example.lectureapi.sem4.homework;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String firstName;
    private String lastName;
    private String family;
    private String fullName;
    private String gender;
    private int age;

    public UserDTO(String firstName, String lastName, String family, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.family = family;
        this.gender = gender;
        this.age = age;
        init();
    }

    private void init() {
        fullName = family + " " + firstName + " " + lastName;
    }

    public String getFormattedInfo() {
        return family + " " + getInitials(firstName, lastName) + " " + gender + " " + age;
    }

    private String getInitials(String firstName, String lastName) {
        return firstName.charAt(0) + ". " + lastName.charAt(0) + ".";
    }
}
