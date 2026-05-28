package oop.exam_studies.ex_05;

public abstract class Employee {
    protected String name;
    protected double salary;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public abstract double getBonus();
}
