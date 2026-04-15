package classroom.class_26_04_15;

public class BonusController {
    private double totalBonus;

    void registerBonus(Employee employee){
        totalBonus += employee.getBonus();
    }

    public double getTotalBonus() {
        return totalBonus;
    }
}
