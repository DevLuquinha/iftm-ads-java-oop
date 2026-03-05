package classroom.class_26_02_26;

public class Account {
    int number;
    String name;
    double balance;

    void deposit(double value){
        this.balance += value;
    }

    void withdraw(double value){
        // Secure withdraw
        if (canWithdraw(value)){
            this.balance -= value;
        }
    }

    boolean canWithdraw(double value){
        if (value > this.balance){
            return false;
        } else {
            return true;
        }
    }

    void showStatement(){
        System.out.printf("\nThe current %s balance: %f", this.name, this.balance);
    }
}
