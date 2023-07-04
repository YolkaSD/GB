package org.example.oop.sem2.taxi;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.callTaxi(new Yandex());
        person.callTaxi(new Uber());
        person.callTaxi(new Friend());

    }
}
