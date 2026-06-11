package oop.classroom_exercises.classroom.class_26_06_03.daos;

import oop.classroom_exercises.classroom.class_26_06_03.aconnectionfactory.ConnectionFactory;
import oop.classroom_exercises.classroom.class_26_06_03.models.Contact;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDao {
    public void addContact(Contact contact){
        Connection connection = new ConnectionFactory().getConnection();

        try {
            String sql = "INSERT INTO contacts (name, email, address, dateOfBirth) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, contact.getName());
            statement.setString(2, contact.getEmail());
            statement.setString(3, contact.getAddress());
            statement.setDate(4, Date.valueOf(contact.getDateOfBirth()));

            statement.execute();
            statement.close();

            System.out.println("Contact added successfully!");
            connection.close();
        } catch (SQLException exception){
            System.out.println("Error adding contact: " + exception.getMessage());
        }
    }
}
