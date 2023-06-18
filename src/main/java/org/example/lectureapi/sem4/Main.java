package org.example.lectureapi.sem4;

import org.example.lectureapi.sem4.homework.UserDTO;
import org.example.lectureapi.sem4.homework.UserManager;

public class Main {
    public static void main(String[] args) {
        UserDTO userDTO1 = new UserDTO("Вячеслав", "Николаевич", "Рыбкин", "M", 17);
        UserDTO userDTO2 = new UserDTO("Анна", "Владимировна","Петрова", "Ж", 17);
        UserDTO userDTO3 = new UserDTO("Ирина", "Алексеевна", "Сергеева", "Ж", 33);
        UserDTO userDTO4 = new UserDTO("Иван", "Мишкин","Иванов", "M",19);


        UserManager userManager = new UserManager();
        userManager.userAdd(userDTO2);
        userManager.userAdd(userDTO1);
        userManager.userAdd(userDTO3);
        userManager.userAdd(userDTO4);

        System.out.println("Список всех пользователей: ");
        userManager.printFormattedUser();
        System.out.println("Отсортированные по возрасту: ");
        userManager.sortByAge();
        userManager.printFormattedUser();
        System.out.println("Отсортированные по возрасту и полу: ");
        userManager.sortByAgeAndGender();
        userManager.printFormattedUser();
    }
}