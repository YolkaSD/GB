package org.example.oop.sem2.taxi;

public class Uber extends Taxi{
    @Override
    public void drive(String address) {
        System.out.println("Uber ждет вас");
    }
}
