package org.example.oop.sem1.vending_pr.vending;

import org.example.oop.sem1.vending_pr.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int idProducts;
    private List<Product> productList;

    public VendingMachine() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
        product.setId(idProducts++);
    }

    public String getProductInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Product product: productList) {
            stringBuilder.append(product).append("\n");
        }
        return stringBuilder.toString();
    }
}
