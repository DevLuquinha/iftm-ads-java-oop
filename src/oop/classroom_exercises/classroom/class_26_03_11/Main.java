package oop.classroom_exercises.classroom.class_26_03_11;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        // 1. Instantiate the main utils class
        MenuUtils menuUtils = new MenuUtils();
        menuUtils.scanner = new Scanner(System.in);

        // 2. Create vars
        Person person = null;
        Patient patient = null;
        int option = -1; // -1 By default

        do {
            System.out.println("WELCOME TO THE PROGRAM");
            menuUtils.showMenu();
            option = menuUtils.getOption();

            switch (option) {
                case 1:
                    person = menuUtils.createPerson();
                    clearConsole();
                    break;
                case 2:
                    if (person == null){
                        System.out.println("BAD SMELL! You don't create any person before!");
                    } else {
                        person.showPersonInfo();
                    }
                    break;
                case 3:
                    if (person == null){
                        System.out.println("BAD SMELL! Don't exists any person, create one before to destroy it!");
                    } else {
                        person = null;
                        clearConsole();
                    }
                    break;
                case 4:
                    patient = menuUtils.createPatient();
                    clearConsole();
                    break;
                case 5:
                    if (patient == null){
                        System.out.println("BAD SMELL! You don't create any patient before!");
                    } else {
                        patient.showPatient();
                    }
                    break;
                case 6:
                    if (patient == null){
                        System.out.println("BAD SMELL! You don't create any patient before!");
                    } else {
                        patient.showBMI();
                    }
                    break;
                case 7:
                    if (patient == null){
                        System.out.println("BAD SMELL! Don't exists any patient, create one before to destroy it!");
                    } else {
                        patient = null;
                        clearConsole();
                    }
                    break;
                case 8:
                    if (person == null){
                        System.out.println("BAD SMELL! Don't exists any person!!!");
                    } else {
                        int ageInDate = person.getAgeInDate("2026");
                        System.out.printf("The %s that born %s will be %d years old in 2026\n",
                                person.name,
                                person.birthDate,
                                ageInDate);
                    }
                    break;
                case 9:
                    System.out.println("Exiting of application! Bye looser");
                    person = null;
                    patient = null;
                    break;
            }
        } while (option != 9);
    }

    static void clearConsole(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
