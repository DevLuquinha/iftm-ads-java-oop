package oop.classroom_exercises.classroom.class_26_03_11;

import java.util.Scanner;

public class MenuUtils {
    Scanner scanner;

    void showMenu(){
        System.out.println("OPTIONS");
        System.out.println("1 - Create a Person (name, salary, and birth date)");
        System.out.println("2 - Show Person");
        System.out.println("3 - Destroy Person");
        System.out.println("4 - Create a Patient (name, weight, height)");
        System.out.println("5 - Show Patient");
        System.out.println("6 - Show Patient BMI");
        System.out.println("7 - Destroy Patient");
        System.out.println("8 - Displays the age the person will be in 202X (based on their date of birth) (10/01/1990)");
        System.out.println("9 - Exit");
    }

    int getOption(){
        int option = -1;
        do {
            System.out.printf("Select one of the options above: ");
            option = Integer.parseInt(scanner.nextLine());

            if (option < 1 || option > 9){
                System.out.println("BAD SMELL! Type a valid option idiot!");
            }
        } while (option < 1 || option > 9);

        return option;
    }

    Person createPerson(){
        Person person = new Person();

        System.out.println("What's your name? ");
        person.name = scanner.nextLine();

        System.out.println("What is your date of the birth? in format (DD/MM/YYYY)");
        person.birthDate = scanner.nextLine();

        System.out.println("How much do you earn?");
        person.salary = Double.parseDouble(scanner.nextLine());

        return person;
    }

    Patient createPatient(){
        Patient patient = new Patient();

        System.out.println("What's your name? ");
        patient.name = scanner.nextLine();

        System.out.println("What's your weight? ");
        patient.weight = Double.parseDouble(scanner.nextLine());

        System.out.println("What's your height? ");
        patient.height = Double.parseDouble(scanner.nextLine());

        return patient;
    }
}
