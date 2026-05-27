package oop.classroom_exercises.classroom.class_26_03_12.ex02;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        Company company = new Company();
        company.name = "Makeng";
        company.cnpj = "112.312.311/0001-56";
        company.employees = new Employee[3];

        // 1. Add employee
        int options = 2;
        do {
            options = getOption();

            switch (options){
                case 1:
                    Employee employee = createEmployee();
                    boolean employeeAdded = company.addEmployee(employee);
                    if (employeeAdded){
                        System.out.println("Employee was added successfully!");
                    } else {
                        System.out.println("OPS! The company is filled! Remove any employee hehe");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    System.out.println(company);
                    break;
            }

        } while(options != 2);
    }

    static int getOption(){
        int option = 2;
        do {
            System.out.println("OPTIONS");
            System.out.print("1 - Add employee to company");
            System.out.print("\n2 - Show the employees on company (exit)");
            System.out.printf("\nType the option: ");

            option = Integer.parseInt(scanner.nextLine());

            if (option != 1 && option != 2){
                System.out.println("BAD SMELL! Type a valid option!");
            }

        } while (option != 1 && option != 2);

        return option;
    }

    static Employee createEmployee(){
        Employee employee = new Employee();

        System.out.print("What's the name of employee? ");
        employee.name = scanner.nextLine();

        System.out.print("What's the salary of employee? ");
        employee.salary = Double.parseDouble(scanner.nextLine());

        return employee;
    }
}
