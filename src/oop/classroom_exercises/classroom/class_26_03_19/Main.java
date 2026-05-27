package oop.classroom_exercises.classroom.class_26_03_19;

public class Main {
    static void main(String[] args) {
        Account account = new Account();
        account.setName("Nubank");

        // Show the account before transactions
        System.out.println(account);

        double valueToWithdraw = 100;
        if (!account.withdraw(valueToWithdraw)){
            System.out.printf(
                    "YOU'RE AN IDIOT! You can't withdraw R$ %.2f because your current balance is %.2f\n",
                    valueToWithdraw,
                    account.getBalance()
            );
        }

        account.deposit(246.24);

        if (!account.withdraw(valueToWithdraw)){
            System.out.printf(
                    "YOU'RE AN IDIOT! You can't withdraw R$ %.2f because your current balance is %.2f\n",
                    valueToWithdraw,
                    account.getBalance()
            );
        }

        System.out.println(account);
    }
}
