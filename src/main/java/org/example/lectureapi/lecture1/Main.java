package org.example.lectureapi.lecture1;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        try (FileWriter fw = new FileWriter("src/main/resources/test1.txt")){
            fw.write("Line 1");
            fw.write("\n");
            fw.write("2");
            fw.write("\n");
            fw.write("line 3");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}