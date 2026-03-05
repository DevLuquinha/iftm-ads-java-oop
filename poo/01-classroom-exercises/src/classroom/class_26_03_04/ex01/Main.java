package classroom.class_26_03_04.ex01;

public class Main {
    static void main(String[] args) {
        // 1. Create a client
        Client client = new Client();
        client.age = 19;
        client.name = "Lucas Emmanuel";

        // 2. Create an account
        Account account = new Account();
        account.name = "Nubank";
        account.number = 1234;
        account.balance = 2000;
        account.client = client;

        // 3. Print account info
        System.out.println(account.getAccountInfo());

        // 4. Rename client
        account.client.updateName("Lulu");

        // 5. Print again
        System.out.println(account.getAccountInfo());
    }
}
