package oop.classroom_exercises.classroom.class_26_05_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();

        // 1. Create products
        Product product1 = new Product("Water Bottle", 10.9);
        Product product2 = new Product("Laptop AsusBook 2", 1000);
        Product product3 = new Product("Mouse Gamer", 100.9);
        Product product4 = new Product("Fingerboard", 57.23);
        Product product5 = new Product("Backpack", 265.9);

        // 2. Add products to list
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        // 3. Show the current list
        showProducts(products);

        // 4. Order list by price
        products.sort(Comparator.comparing(Product::getPrice));
        showProducts(products);
    }

    private static void showProducts(List<Product> products){
        System.out.println("The Current list is:");
        for(Product p : products){
            System.out.println(p);
        }
    }
}
