package oop.classroom_exercises.classroom.class_26_03_05.ex01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        InputManager inputManager = new InputManager();
        OutputManager outputManager = new OutputManager();

        boolean useScanner = false; // Toggle var

        // 1. Get name
        inputManager.setName(person, scanner, useScanner);

        // 2. Get age
        inputManager.setAge(person, scanner, useScanner);

        // 3. Get salary
        inputManager.setSalary(person, scanner, useScanner);

        // 4. Show the person info
        outputManager.showPersonInfo(person, scanner, useScanner);
    }
}
