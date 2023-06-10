package org.example.lectureapi.lecture2;

import java.io.IOException;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            s.append("+");
//        }

        // Чтение файлов
        // TODO
        // Логирование

        // Использование
        Logger logger = Logger.getLogger(org.example.lectureapi.sem1.Main.class.getName());
        // Уровни важности
        // INFO, DEBUG, WARNING и др.

        // Вывод
        ConsoleHandler info = new ConsoleHandler();
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("src/main/resources/log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fileHandler);

        // Формат вывода
        // XMLFormatter, SimpleFormatter
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //info.setFormatter(simpleFormatter);
        fileHandler.setFormatter(simpleFormatter);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
