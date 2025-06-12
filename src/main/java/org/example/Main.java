package org.example;

import org.example.io.ContactReader;
import org.example.io.ContactWriter;
import org.example.model.Contact;
import org.example.service.ContactManager;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        ContactManager manager = new ContactManager();
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        ContactWriter writer = new ContactWriter();
        ContactReader reader = new ContactReader();

        System.out.println("Hello bienvenue dans votre gestionnaire de contact !!!");
        // Ajouter un contact
        Scanner s = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom de famille");
        String guessLastName = s.nextLine();
        System.out.println("Veuillez entrer votre prénom");
        String guessFirstName = s.nextLine();
        System.out.println("Veuillez entrer voter email");
        String guessEmail = s.nextLine();
        System.out.println("Veuillez entrer votre numéro de téléphone fixe ou mobile");
        String guessPhoneNumber = s.nextLine();
        System.out.println("veuillez entrer le nom du dossier pour sauvegarder votre contact");
        Path guessSaveInformation = Paths.get(s.nextLine());
        manager.createContact(guessFirstName, guessLastName, guessPhoneNumber, guessEmail, guessSaveInformation);
        manager.getAllContacts(contacts);
    }

}

// Mettre des tests en place et des régles
