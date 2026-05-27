package oop.classroom_exercises.classroom.class_26_03_05.ex01;

import javax.swing.*;
import java.util.Scanner;

public class OutputManager {
    void showPersonInfo(Person person, Scanner scanner, boolean useScanner){
        if (person == null){
            System.out.println("ERROR! the person was not referenced");
            return;
        }

        String message = String.format("The %s is %d years old and earns R$%.2f",
                person.name,
                person.age,
                person.salary);

        if (useScanner){
            System.out.println(message);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    message,
                    "Person INFO",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }

}
