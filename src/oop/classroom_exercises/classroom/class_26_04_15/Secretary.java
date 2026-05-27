package oop.classroom_exercises.classroom.class_26_04_15;

import java.time.LocalDateTime;

public class Secretary extends Employee{
    public void scheduleMeet(LocalDateTime targetDate){
        System.out.println("The meet for " + targetDate.toString() + " it's scheduled!");
    }

    @Override
    public double getBonus() {
        return getSalary() * 1.05;
    }
}
