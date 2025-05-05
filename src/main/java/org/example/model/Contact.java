package org.example.model;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    public Contact(String firstName, String lastname, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.phone = phone;
        this.email = email;

    }

    public Contact(String firstName, String lastName, String email, int phone) {
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

    @Override
    public String toString() {
        return String.format("%s %s - %s - %s", firstName, lastName, email, phone);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
