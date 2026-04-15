package classroom.class_26_04_15;

public class Programmer extends Employee{
    @Override
    public double getBonus() {
        return getSalary() * 2;
    }
}
