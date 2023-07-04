package org.example.oop.sem2.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(new Cat());
        speakables.add(new Dog());
        speakables.add(new Dog());
        speakables.add(new Cat());
        speakables.add(new Radio());

        ZooNoise zooNoise = new ZooNoise(speakables);
        zooNoise.speakAll();
    }
}
