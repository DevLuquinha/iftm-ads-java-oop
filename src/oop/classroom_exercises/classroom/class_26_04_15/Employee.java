package oop.classroom_exercises.classroom.class_26_04_15;

public class Employee {
    private String name;
    private double salary;
    private String cpf;

    public double getBonus(){
        return salary * 1.1; // 10% by default
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("The ");
        b.append(getName());
        b.append(" earns R$");
        b.append(getSalary());
        return b.toString();
    }
}
