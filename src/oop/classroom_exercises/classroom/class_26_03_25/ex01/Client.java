package oop.classroom_exercises.classroom.class_26_03_25.ex01;

public class Client {
    private String name = "";
    private int age = 0;
    private String cpf = "XXX.XXX.XXX-XX";
    private double height = 0.0;

    public  Client(){

    }

    public Client(String name){
        this.name = name;
    }

    public Client(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Client(String name, int age, String cpf){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public Client(String name, int age, String cpf, double height){
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Client client = (Client)obj;

        // A lot of conditionals
        return client.name.equals(name) &&
                client.height == height &&
                client.age == age &&
                client.cpf.equals(cpf);
    }

    @Override
    public String toString() {
        return "The " + name + " with the CPF equals " + cpf + " has " + height + "m and is " + age + " years old";
    }
}
