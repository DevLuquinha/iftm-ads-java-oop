package oop.classroom_exercises.classroom.class_26_03_19;

public class Account {
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean withdraw(double value){
        // 1. Check if the user contains balance
        if (this.balance < value){
            return false;
        }

        this.balance -= value;
        return true;
    }

    public void deposit(double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return "Your current balance in " + name + " is R$ " + balance;
    }
}
