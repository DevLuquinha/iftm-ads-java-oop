package oop.classroom_exercises.classroom.class_26_03_05.ex02;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create person
        Person person = new Person();

        // 2. Populate person object
        System.out.println("Type the user name: ");
        person.name = scanner.nextLine();

        System.out.println("What's the person weight?");
        person.weight = Double.parseDouble(scanner.nextLine());

        System.out.println("What's the person height?");
        person.height = Double.parseDouble(scanner.nextLine());

        // 3. Calculate and show the BMI (IMC)
        double bmiPerson = person.calculateBMI();

        String weightStatus = ""; // By default

        if (bmiPerson < 20){
            weightStatus = "Skinny";
        } else if (bmiPerson < 24){
            weightStatus = "Normal";
        } else if (bmiPerson < 29){
            weightStatus = "Overweight";
        } else if (bmiPerson < 34){
            weightStatus = "Obese";
        } else if (bmiPerson >= 35){
            weightStatus = "Very Obese";
        }

        System.out.printf("The %s has %.1fm and %.2fkg. The BMI is %.2f and %s",
                person.name,
                person.height,
                person.weight,
                bmiPerson,
                weightStatus);
    }
}
