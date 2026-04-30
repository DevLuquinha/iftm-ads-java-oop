package classroom.class_26_04_30;

import java.time.LocalDateTime;

public class Main {
    static void main(String[] args) {
        Product product = new Product(
                1,
                "Mouse Gamer",
                "The Mouse is a peripheral device used to interact with the computer. It allows users to move a cursor on the screen and perform various actions by clicking buttons or using a scroll wheel.",
                150.00,
                true,
                LocalDateTime.now()
        );

        System.out.println("Original Product" + product.toString());

        System.out.println("==================================================");
        System.out.println("Cloning product...");
        System.out.println("==================================================");

        try {
            Product productClone = product.clone();
            System.out.println("Cloned Product" + productClone.toString());
        } catch (Exception e) {
            System.out.println("Error cloning product: " + e.getMessage());
        }
    }
}
