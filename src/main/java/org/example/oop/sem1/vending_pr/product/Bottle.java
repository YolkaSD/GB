package org.example.oop.sem1.vending_pr.product;

public class Bottle extends Product{
    private double volume;

    public Bottle(String name, double price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume;
    }
}
