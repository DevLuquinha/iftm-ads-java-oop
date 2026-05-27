package oop.classroom_exercises.classroom.class_26_04_09;

public class Employee {
    private String name;
    private String cpf;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("\nUser: " + this.name);
        b.append("\nCPF: " + this.cpf);
        b.append("\nSalary: R$" + this.salary);

        return b.toString();
    }
}
