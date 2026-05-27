package oop.classroom_exercises.classroom.class_26_03_11;

public class Person {
    String name;
    double salary;
    String birthDate;

    void showPersonInfo(){
        System.out.printf("The %s born %s and earns %.2f\n",
                name,
                birthDate,
                salary);
    }

    int getAgeInDate(String targetDate){
        // Get person date
        int personYears = Integer.parseInt(birthDate.substring(6));
        
        // Get target date
        int targetYears = Integer.parseInt(targetDate);

        return targetYears - personYears;
    }

}
