package oop.classroom_exercises.classroom.class_26_03_11;

public class Patient {
    String name;
    double height;
    double weight;

    void showPatient(){
        System.out.printf("The %s has %.1fm and %.2f\n",
                name,
                height,
                weight);
    }

    void showBMI() {
        double bmi = 0;
        if (height != 0){
            bmi = height / (height * height);
        }

        System.out.printf("The BMI of %s is %.2f\n",
                name,
                height,
                weight);
    }
}
