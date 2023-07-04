package org.example.oop.sem2.taxi;

public class Taxi implements Drivable{
    @Override
    public void drive(String address) {
        System.out.println("Taxi ждет вас");
    }
}
