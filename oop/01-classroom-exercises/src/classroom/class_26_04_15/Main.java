package classroom.class_26_04_15;

public class Main {
    static void main(String[] args) {
        // 1. Create a simple employee
        Employee employee = new Employee();
        employee.setName("Felipe Lara");
        employee.setSalary(1800);
        employee.setCpf("123.456.987-78");

        // 2. Create the supreme employee
        Manager manager = new Manager();
        manager.setName("Rafaella Nunes");
        manager.setSalary(100000);
        manager.setCpf("123.432.564-46");

        // 3. Create a strage person of my world
        Secretary secretary = new Secretary();
        secretary.setName("Jose");
        secretary.setSalary(20);
        secretary.setCpf("999.222.333-12");

        // 4. Create a cooked programmer
        Programmer programmer = new Programmer();
        programmer.setName("Eduardo Borges");
        programmer.setSalary(1900);
        programmer.setCpf("737.427.873-98");

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(secretary.toString());
        System.out.println(programmer.toString());

        // 5. Add bonus for employees
        BonusController b = new BonusController();
        b.registerBonus(employee);
        b.registerBonus(manager);
        b.registerBonus(secretary);
        b.registerBonus(programmer);

        System.out.println("The total company bonus is R$" + b.getTotalBonus());
    }
}
