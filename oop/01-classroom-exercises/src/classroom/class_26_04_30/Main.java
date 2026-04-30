package classroom.class_26_04_30;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(1);

        try {
            System.out.println("1");
            inventory.accessStock(2);

        } catch (MissingInventoryCheckedException ex){

        }

        System.out.println("2");
        
        inventory.accessStock2(2);

        System.out.println("3");
    }
}
