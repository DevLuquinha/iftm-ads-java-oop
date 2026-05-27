package oop.classroom_exercises.classroom.class_26_03_12.ex02;

public class Company {
    String name;
    String cnpj;
    Employee[] employees;

    boolean addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String result = "The company " + name + " with cnpj " + cnpj + "\n";

        for (Employee employee: employees) {
            if (employee != null){
                result += employee + "\n";
            }
        }

        return result;
    }
}
