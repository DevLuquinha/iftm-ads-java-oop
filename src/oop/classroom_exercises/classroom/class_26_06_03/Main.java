package oop.classroom_exercises.classroom.class_26_06_03;

import oop.classroom_exercises.classroom.class_26_06_03.aconnectionfactory.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection =  connectionFactory.getConnection();

        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Connected :)");
    }
}
