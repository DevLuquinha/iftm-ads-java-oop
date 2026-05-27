package oop.classroom_exercises.classroom.class_26_03_05.ex01;

import javax.swing.*;
import java.util.Scanner;

public class InputManager {
    void setName(Person person, Scanner scanner, boolean useScanner){
        if (person == null){
            System.out.println("ERROR! the person was not referenced");
            return;
        }

        if (useScanner) {
            System.out.println("What's your name? ");
            person.name = scanner.nextLine();
        } else {
            person.name = JOptionPane.showInputDialog("What's your name");
        }
    }

    void setAge(Person person, Scanner scanner, boolean useScanner){
        if (person == null){
            System.out.println("ERROR! the person was not referenced");
            return;
        }

        if (useScanner){
            System.out.println("How old are you?");
            person.age = Integer.parseInt(scanner.nextLine());
        } else {
            person.age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        }
    }

    void setSalary(Person person, Scanner scanner, boolean useScanner){
        if (person == null){
            System.out.println("ERROR! the person was not referenced");
            return;
        }

        if (useScanner){
            System.out.println("How much do you earn?");
            person.salary = Double.parseDouble(scanner.nextLine());
        } else {
            person.salary = Double.parseDouble(JOptionPane.showInputDialog("How much do you earn?"));
        }
    }
}
