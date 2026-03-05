package classroom.class_26_03_05;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("What's your salary?");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.printf("User: %s is %d years old and received %.2f", name, age, salary);
    }
}
