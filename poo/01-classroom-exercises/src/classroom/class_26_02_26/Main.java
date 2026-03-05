package classroom.class_26_02_26;

public class Main {
    static void main(String[] args) {
        Account nubank = new Account();
        nubank.name = "Nubank";
        nubank.number = 1234;

        Account inter = new Account();
        inter.name = "Inter";
        inter.number = 5678;

        // 1. Add balance for bank accounts
        nubank.deposit(100);
        if (!nubank.canWithdraw(100)){
            System.out.println("Warning! You can't withdraw because your balance is smallest. YOU'RE A POOR!!!");
        } else {
            nubank.withdraw(30);
        }

        inter.deposit(300);
        if (!inter.canWithdraw(20)){
            System.out.println("Warning! You can't withdraw because your balance is smallest. YOU'RE A POOR!!!");
        } else {
            inter.withdraw(20);
        }

        // 2. Get the bank statements
        System.out.print("\nBANK STATEMENTS");
        nubank.showStatement();
        inter.showStatement();
    }
}
