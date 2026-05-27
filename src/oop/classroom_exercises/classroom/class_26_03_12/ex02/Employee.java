package oop.classroom_exercises.classroom.class_26_03_12.ex02;

public class Employee {
    String name;
    double salary;

    @Override
    public String toString() {
        return "Employee name " + name +
                ", salary R$" + salary;
    }
}
