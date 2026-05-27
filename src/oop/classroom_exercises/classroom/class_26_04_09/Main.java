package oop.classroom_exercises.classroom.class_26_04_09;

public class Main {
    static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Lucas Emmanuel");
        employee.setCpf("704.123.654-49");
        employee.setSalary(1023.21);

        Manager manager = new Manager();
        manager.setName("Jose Macciotti");
        manager.setCpf("123.456.789-10");
        manager.setSalary(30000.92);
        manager.setPassword("fazOL");
        manager.setEmployeesCount(1);

        System.out.println(employee);
        System.out.println(manager);
    }
}
