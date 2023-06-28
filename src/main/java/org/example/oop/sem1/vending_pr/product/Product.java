package org.example.oop.sem1.vending_pr.product;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product( String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name=" + name +
                ", price=" + price;
    }
}
