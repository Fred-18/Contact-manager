package org.example.model;

import java.nio.file.Path;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Path filePath;

    public Contact(String firstName, String lastname, String email, String phone, Path filePath) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.phone = phone;
        this.email = email;
        this.filePath = filePath;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setlastName(String lastname) {
        this.lastName = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;

    }

    @Override
    public String toString() {
        return String.format("%s %s - %s - %s", firstName, lastName, phone, email);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void firstNameFirstCharacterOnUpperCase() {
        String name = getFirstName();
        String formatted = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        setFirstName(formatted);
    }

    public void lastNameFirstCharacterOnUpperCase() {
        String name = getLastName();
        String formatted = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        setlastName(formatted);
    }

    public void checkPhoneNumber() throws Exception {
        String phone = getPhone();
        System.out.println(phone);
        if (phone.length() != 10) {
            throw new Exception("A phone number must have 10 numbers");
        }
    }
}
