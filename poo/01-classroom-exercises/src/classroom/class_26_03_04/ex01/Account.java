package classroom.class_26_03_04.ex01;

public class Account {
    int number;
    String name;
    double balance;
    Client client;

    String getAccountInfo(){
        String response = "\n=== THE ACCOUNT INFO ===" +
                "\nNumber: " + number +
                "\nName: " + name +
                "\nBalance: " + balance +
                "\nClient: " + client.getClientInfo();

        return response;
    }
}
