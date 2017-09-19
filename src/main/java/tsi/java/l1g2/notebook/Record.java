package tsi.java.l1g2.notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Record {
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private List<String> phones = new ArrayList<>();

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
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

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) {
      //  this.phone = phone;
        Collections.addAll(this.phones, phones);
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", e-mail='" + email + '\'' +
                ", phones='" + phones + '\'' +
                '}';
    }
}
