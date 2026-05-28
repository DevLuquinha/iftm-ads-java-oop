package oop.exam_studies.ex_03;

public class Company {
    private Employee[] employees = new Employee[3];

    public boolean addEmployee(Employee employee){
        for(int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }
        }

        return false;
    }
}
