package oop.classroom_exercises.classroom.class_26_04_09;

public class Manager extends Employee{
    private String password;
    private int employeesCount;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    public boolean login(String password){
        return this.password.equals(password);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("\nUser: " + this.getName());
        b.append("\nCPF: " + this.getCpf());
        b.append("\nSalary: R$" + this.getSalary());
        b.append("\nManaged Employees Count: " + this.employeesCount);
        return b.toString();
    }
}
