package org.example.lectureapi.sem2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) {
        printJson();
    }

    public static void printJson(){
        File jsonFilePath = new File("src/main/resources/json1.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonFilePath);
            StringBuilder stringBuilder = new StringBuilder();
            for (JsonNode studentNode: jsonNode) {
                String lastname = studentNode.get("фамилия").asText();
                String feedback = studentNode.get("оценка").asText();
                String subject  = studentNode.get("предмет").asText();

                stringBuilder
                        .append("Студент [")
                        .append(lastname).append("] получил [").append(feedback).append("] по предмету [").append(subject).append("]");
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
