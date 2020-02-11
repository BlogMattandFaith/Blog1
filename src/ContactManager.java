import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
    private List<String> contact;
    private String firstName;
    private String lastName;
    private int contacts;
    private String email;


    public List<String> getContact() {
        return contact;
    }

    public void setContact() {
        this.contact = new ArrayList<>();
    }


    public String getFirst() {
        return firstName;
    }

    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    public String getLast() {
        return lastName;
    }

    public void setLast(String lastName) {
        this.lastName = lastName;
    }

    public int getContacts() {
        return contacts;
    }

    public void setContacts(int contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
