package oop.classroom_exercises.classroom.class_26_03_05.ex02;

public class Person {
    String name;
    double weight;
    double height;

    double calculateBMI(){
        if (height == 0){
            return  0;
        };

        return weight / (height * height);
    }
}
