package classroom.class_26_04_30;

public class Inventory {
    private int stock;

    public Inventory(int stock) {
        this.stock = stock;
    }

    public void accessStock(int stockId) throws MissingInventoryCheckedException{
        if (stockId > this.stock){
            throw new MissingInventoryCheckedException("The stockId is unavailable! Idiot!");
        }
    }

    public void accessStock2(int stockId) throws MissingInventoryUncheckedException{
        if (stockId > this.stock){
            throw new MissingInventoryUncheckedException("The stockId is unavailable! Idiot!");
        }
    }
}
