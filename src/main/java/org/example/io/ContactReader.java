package org.example.io;

import org.example.model.Contact;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactReader {
    public List<Contact> readContactsFromFile(Path fileName) {
        if (!Files.exists(fileName)) {
            return new ArrayList<>();
        }
        List<Contact> contacts = new ArrayList<>();
        Path filePath = Paths.get(String.valueOf(fileName));
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String firstName = parts[0];
                    String lastName = parts[1];
                    String email = parts[2];
                    String phone = parts[3];
                    Contact contact = new Contact(firstName, lastName, email, phone, filePath);
                    contacts.add(contact);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

}


