package oop.classroom_exercises.classroom.class_26_06_03;

import oop.classroom_exercises.classroom.class_26_06_03.daos.ContactDao;
import oop.classroom_exercises.classroom.class_26_06_03.models.Contact;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        contact.setId(1);
        contact.setName("Lucas Emmanuel");
        contact.setEmail("lucas.emmanuel@estudante.iftm.edu.br");
        contact.setAddress("Av. Maranhão 936");
        contact.setDateOfBirth(LocalDate.of(2006, 11, 19));

        ContactDao contactDao = new ContactDao();
        contactDao.addContact(contact);
    }
}
