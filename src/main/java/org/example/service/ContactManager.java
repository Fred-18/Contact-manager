package org.example.service;

import org.example.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    public Contact createContact(String firstName, String lastName, String phone, String email) {
        Contact contact = new Contact(firstName, lastName, phone, email);
        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(contact);
        return contact;
    }

    public void deleteContact(List<Contact> contact, String email) {
        String emailToDelete;
        for (Contact c : contact) {
            emailToDelete = c.getEmail();
            if (email.equals(emailToDelete)) {
                contact.remove(emailToDelete);
            }
        }
    }

}


