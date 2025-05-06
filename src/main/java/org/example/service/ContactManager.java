package org.example.service;

import org.example.io.ContactReader;
import org.example.io.ContactWriter;
import org.example.model.Contact;

import java.util.Iterator;
import java.util.List;

public class ContactManager {

    public Contact createContact(String firstName, String lastName, String phone, String email) {
        Contact contact = new Contact(firstName, lastName, phone, email);
        ContactReader reader = new ContactReader();
        List<Contact> contacts = reader.readContactsFromFile("contacts.txt");
        contacts.add(contact);
        ContactWriter writer = new ContactWriter();
        writer.writeContactsToFile(contacts, "contacts.txt");
        return contact;

    }

    public void deleteContact(List<Contact> contacts, String email) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getEmail().equals(email)) {
                iterator.remove();
                ContactWriter updateListe = new ContactWriter();
                updateListe.writeContactsToFile(contacts, "contacts.txt");
            }
        }
    }

    public Contact updateContact(List<Contact> contacts, String lastName) {
        // Je veux iteree dans une liste de contact que je renseigne dans les params
        Iterator<Contact> iterator = contacts.iterator();
        //Je recupere le nom de famille du contact a update
        //J'appliaue les modifications au champs  que je veux modifer
        // je souvegarde ma liste

    }


}


