package org.example.service;

import org.example.model.Contact;
import org.junit.Test;

import java.nio.file.Path;

public class ContactManagerTest {
    @Test
    public void thePhoneNumberMustHave10Numbers() throws Exception {
        //GIVEN
        Path filePath = Path.of("contact.txt");
        String wrongPhoneNumber = "1212121212";
        Contact testContact = new Contact("Robert", "Boulard", "rob@gmail.com", wrongPhoneNumber, filePath);
        //WHEN
        String callTheMethod = testContact.getPhone();
        if (callTheMethod.length() != 10) {
            throw new Exception("A phone number must have 10 numbers");
        }
        //THEN
    }

}


