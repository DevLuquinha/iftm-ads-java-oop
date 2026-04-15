package classroom.class_26_04_15;

public class Manager extends Employee{

    @Override
    public double getBonus() {
        return getSalary() * 1.5; // 50% increase
    }
}
