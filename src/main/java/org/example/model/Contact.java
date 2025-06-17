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
        if (name != null && !name.isEmpty()) {
            String formatted = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            setFirstName(formatted);
        }
    }

    public void lastNameFirstCharacterOnUpperCase() {
        String name = getLastName();
        if (name != null && !name.isEmpty()) {
            String formatted = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            setlastName(formatted);
        }
    }

    public String checkPhoneNumber() {
        String phone = getPhone();
        if (phone.length() != 10) {
            throw new IllegalArgumentException("A phone number must have 10 numbers");
        }
        return phone;
    }

    public String checkFirstName() {
        String firstName = getFirstName();
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name missing !!!");
        } else if (firstName.length() < 3) {
            throw new IllegalArgumentException("A first name must have at least 3 characters");
        }
        return firstName;
    }

    public String checkLastName() {
        String lastName = getLastName();
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name missing !!!");
        } else if (lastName.length() < 3) {
            throw new IllegalArgumentException("A last name must have at least 3 characters");
        }
        return lastName;
    }
// todo redondence il y a un truc a faire
}
