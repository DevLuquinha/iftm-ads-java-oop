package classroom.c260304;

public class Client {
    int age;
    String name;

    void updateName(String newName){
        name = newName;
    }

    String getClientInfo(){
        return "\n=== CLIENT INFO ===" +
                "\nName: " + name +
                "\nAge: " + age;
    }
}
