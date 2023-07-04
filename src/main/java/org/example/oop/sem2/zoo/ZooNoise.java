package org.example.oop.sem2.zoo;

import java.util.List;

public class ZooNoise {
    private List<Speakable> speakables;

    public ZooNoise(List<Speakable> speakables) {
        this.speakables = speakables;
    }

    public void speakAll() {
        speakables.forEach(Speakable::speak);
    }
}

