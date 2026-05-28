package oop.exam_studies.ex_04;

public class Account {
    private int id;
    private static int accountCounter = 1;

    public Account(){
        this.id = Account.accountCounter;
        Account.accountCounter++;
    }

    public int getId() {
        return id;
    }
}
