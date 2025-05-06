package org.example.service;

import org.example.model.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactManager {

    public Contact createContact(String firstName, String lastName, String phone, String email) {
        Contact contact = new Contact(firstName, lastName, phone, email);
        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(contact);
        return contact;
    }

    public void deleteContact(List<Contact> contacts, String email) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getEmail().equals(email)) {
                iterator.remove();
                System.out.println(contact);
            }
        }
    }


}


