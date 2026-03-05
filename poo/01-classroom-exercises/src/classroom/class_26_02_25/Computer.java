package classroom.class_26_02_25;

public class Computer {
    int memory;
    int storage;
    String brand;
    String model;
    boolean isConnected;

    void shutDown(){
        isConnected = false;
    }

    void print(){
        System.out.println(storage);
        System.out.println(model);
    }

    public static void main(String[] args){
        // Create the first computer
        Computer c1 = new Computer();
        c1.storage = 1024;
        c1.brand = "Samsung";
        c1.model = "Galaxy Book 2";
        c1.memory = 16;

        // Create the second computer
        Computer c2 = new Computer();
        c1.storage = 512;
        c1.brand = "Lenovo";
        c1.model = "12345";
        c1.memory = 16;
    }
}
