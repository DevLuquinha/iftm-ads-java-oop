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
            String sql = "INSERT INTO contacts (id, name, email, address, dateOfBirth) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, contact.getId());
            statement.setString(2, contact.getName());
            statement.setString(3, contact.getEmail());
            statement.setString(4, contact.getAddress());
            statement.setDate(5, Date.valueOf(contact.getDateOfBirth()));

            statement.execute();
            statement.close();

            System.out.println("Contact added successfully!");
            connection.close();
        } catch (SQLException exception){
            System.out.println("Error adding contact: " + exception.getMessage());
        }
    }
}
