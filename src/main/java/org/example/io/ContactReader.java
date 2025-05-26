package org.example.io;

import org.example.model.Contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactReader {
    public List<Contact> readContactsFromFile(String fileName) {
        List<Contact> contacts = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String firstName = parts[0];
                    String lastName = parts[1];
                    String email = parts[2];
                    String phone = parts[3];
                    Contact contact = new Contact(firstName, lastName, email, phone, paths);
                    contacts.add(contact);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return contacts;
    }

}


