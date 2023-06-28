package org.example.oop.sem1.vending_pr;

import org.example.oop.sem1.vending_pr.product.Bottle;
import org.example.oop.sem1.vending_pr.product.Product;
import org.example.oop.sem1.vending_pr.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Product product1 = new Bottle("Coca-cola", 85.60, 0.45);
        Product product2 = new Product("Chocolate milka", 45);
        Product product3 = new Product("Coffee 3 in 1", 15.50);
        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine.getProductInfo());
    }
}
