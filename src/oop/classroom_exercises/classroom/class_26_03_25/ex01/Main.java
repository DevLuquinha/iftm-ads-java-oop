package oop.classroom_exercises.classroom.class_26_03_25.ex01;

public class Main {
    static void main(String[] args) {
        // 1. Create four clients with constructors
        Client c1 = new Client("Lucas");
        Client c2 = new Client("Rafaella", 19);
        Client c3 = new Client("Jose", 30, "123.456.789-10");
        Client c4 = new Client("Joao", 10, "987.654.321-01", 90.2);

        // 2. Create a client with setters
        Client c5 = new Client();
        c5.setName("Paulo");
        c5.setAge(5);
        c5.setCpf("456.654.123-32");
        c5.setHeight(12.78);

        // 3. Test the equals method
        if (c1.equals(c2))

        // 4. Print the clients data
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
