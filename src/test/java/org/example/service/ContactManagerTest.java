package org.example.service;

import org.example.model.Contact;
import org.junit.Test;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactManagerTest { // todo rename en contact test car je ne test pas les methode de contactManage

    @Test
    public void thePhoneNumberMustHave10Numbers() {
        //GIVEN
        String result;
        Path filePath = Path.of("contact.txt");
        String wrongPhoneNumber = "1010101010000";
        Contact testContact = new Contact("Robert", "Boulard", "rob@gmail.com", wrongPhoneNumber, filePath);//WHEN
        //WHEN+THEN
        assertThrows(IllegalArgumentException.class, testContact::checkPhoneNumber);
    }

    @Test
    public void aUserMustHaveAFirstName() {
        //GIVEN
        Path filePath = Path.of("contact.txt");
        Contact testContact = new Contact(null, null, "empty@Gmail.com", "0192837465", filePath);
        //WHEN+THEN
        assertThrows(IllegalArgumentException.class, testContact::checkFirstName);
    }


    @Test
    public void aUserShouldHaveALastName() {
        //GIVEN
        Path filePath = Path.of("contact.txt");
        Contact testContact = new Contact(null, null, "empty@Gmail.com", "0192837465", filePath);
        //WHEN+THEN
        assertThrows(IllegalArgumentException.class, testContact::checkLastName);
    }
}


