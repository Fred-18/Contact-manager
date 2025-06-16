package org.example.service;

import org.example.model.Contact;
import org.junit.Test;

import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class ContactManagerTest { // todo Renomer en contact test car je ne test pas les methode de contactManager
    @Test
    public void thePhoneNumberMustHave10Numbers() throws Exception {
        //GIVEN
        String resutl;
        Path filePath = Path.of("contact.txt");
        String wrongPhoneNumber = "1010101010000";
        Contact testContact = new Contact("Robert", "Boulard", "rob@gmail.com", wrongPhoneNumber, filePath);
        //WHEN
        resutl = testContact.checkPhoneNumber();
        //THEN
        assertEquals("A phone number must have 10 numbers", resutl);
    }

    @Test
    public void aUserMustHaveAFirstName() throws Exception {
        //GIVEN
        Path filePath = Path.of("contact.txt");
        String userWithNoFirstName = null;
        String userWithLastName = null;
        Contact testContact = new Contact(userWithNoFirstName, userWithLastName, "empty@Gmail.com", "0192837465", filePath);
        //WHEN
        String resutl = testContact.checkFirstName();
        //THEN
        assertEquals("First name missing !!!", resutl);
    }

}


