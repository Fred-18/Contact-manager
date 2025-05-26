package org.example.io;

import org.example.model.Contact;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ContactWriter {
    public void writeContactsToFile(List<Contact> contacts, Path filePath) {
        Path directory = filePath.getParent();
        if (directory != null && !Files.exists(directory)) {
            try {
                Files.createDirectories(directory);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            for (Contact contact : contacts) {

                String line = String.format("%s,%s,%s,%s\n", contact.getFirstName(), contact.getLastName(), contact.getEmail(), contact.getPhone());
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
