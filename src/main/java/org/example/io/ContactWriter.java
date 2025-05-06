package org.example.io;

import org.example.model.Contact;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContactWriter {
    public void writeContactsToFile(List<Contact> contacts, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Contact contact : contacts) {

                String line = String.format("%s,%s,%s,%s\n", contact.getFirstName(), contact.getLastName(), contact.getEmail(), contact.getPhone());
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
