package oop.exam_studies.ex_05;

public class Manager extends Employee{
    @Override
    public double getBonus() {
        return this.salary * 0.10;
    }
}
