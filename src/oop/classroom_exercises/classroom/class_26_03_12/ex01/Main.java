package oop.classroom_exercises.classroom.class_26_03_12.ex01;

public class Main {

    static void main(String[] args) {
        Person[] people = new Person[3];

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // 1. Add person one
        p1.name = "Lucas Emmanuel";
        p1.age = 19;
        p1.weight = 72;
        people[0] = p1;

        // 2. Add person two
        p2.name = "Rafaella";
        p2.age = 19;
        p2.weight = 50;
        people[1] = p2;

        // 3. Add person three
        p3.name = "Lara";
        p3.age = 29;
        p3.weight = 60;
        people[2] = p3;

        for (int i = 0; i < 3; i++) {
            System.out.println(people[i].toString());
        }
    }
}
