package org.example.service;

import org.example.model.Contact;

import java.util.ArrayList;

public class ContactManager {

    public Contact createContact(String firstName, String lastName, String email, String phone) {
        Contact contact = new Contact(firstName, lastName, email, phone);
        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(contact);
        return contact;




    }

}
