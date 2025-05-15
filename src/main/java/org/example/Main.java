package org.example;

import org.example.io.ContactReader;
import org.example.io.ContactWriter;
import org.example.model.Contact;
import org.example.service.ContactManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ContactManager manager = new ContactManager();
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        ContactWriter writer = new ContactWriter();
        ContactReader reader = new ContactReader();

        contacts.add(manager.createContact("fred", "Manunuig", "truc.com", "0909090909"));
        contacts.add(manager.createContact("momo", "Momo", "truc.com", "0909090909"));
        contacts.add(manager.createContact("tata", "Nana", "truc.com", "0909090909"));
        contacts.add(manager.createContact("titui", "moom", "truc.com", "0909090909"));
        contacts.add(manager.createContact("titui", "moom", "teex.com", "0909090909"));

        writer.writeContactsToFile(contacts, "contacts.txt");
        manager.deleteContact(contacts, "teex.com");
        List<Contact> testAfterUpdate = reader.readContactsFromFile("contacts.txt");
        // System.out.println(testAfterUpdate);

        manager.updateContact(contacts, "Manunuig", "Jeff", "tyty.com", "020202020202");
        List<Contact> testAfterUpdate2 = reader.readContactsFromFile("contacts.txt");
        //System.out.println(testAfterUpdate2);

        Contact result = manager.getContact(contacts, "");
        System.out.println(result);

        List testContacts = manager.getAllContacts(contacts);
        System.out.println(testContacts);
    }

}