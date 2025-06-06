package org.example.service;

import org.example.io.ContactReader;
import org.example.io.ContactWriter;
import org.example.model.Contact;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ContactManager {

    public Contact createContact(String firstName, String lastName, String phone, String email, Path paths) {
        Contact contact = new Contact(firstName, lastName, phone, email, paths);
        ContactReader reader = new ContactReader();
        List<Contact> contacts = reader.readContactsFromFile(paths);
        contacts.add(contact);
        ContactWriter writer = new ContactWriter();
        writer.writeContactsToFile(contacts, Paths.get(paths.toString()));

        return contact;
    }

    public void deleteContact(List<Contact> contacts, String email) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getEmail().equals(email)) {
                iterator.remove();
                ContactWriter updateListe = new ContactWriter();
                updateListe.writeContactsToFile(contacts, Paths.get(""));
            }
        }
        // Modifier la methode delete
    }

    public void updateContact(List<Contact> contacts, String lastName, String theNewFirstName, String theNewEmail, String theNewPhone) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getLastName().equals(lastName)) {
                contact.setFirstName(theNewFirstName);
                contact.setEmail(theNewEmail);
                contact.setPhone(theNewPhone);
            } else {
                System.out.println();
            }
        }
        ContactWriter updateListe = new ContactWriter();
        updateListe.writeContactsToFile(contacts, Paths.get(""));
    }

    public Contact getContact(List<Contact> contacts, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        System.out.println("Contact is not on the list");
        return null;
    }

    public List getAllContacts(List<Contact> contacts) {
        return contacts;
    }
}



