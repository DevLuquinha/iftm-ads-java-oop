package oop.classroom_exercises.classroom.class_26_03_25.ex02;

public class Account {
    public static int lastId = 1;
    private int id;

    public Account(){
        this.id = Account.lastId;
        Account.lastId += 1;
    }

    public int getId() {
        return id;
    }
}
