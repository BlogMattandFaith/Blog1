import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {

    Scanner in = new Scanner(System.in);

    private List<String> contact;
    private String firstName;
    private String lastName;
    private int contacts;
    private String email;

    public ContactManager(String contact, String firstName, String lastName, int contacts, String email) {
        this.contact = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
        this.email = email;
    }


    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
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

        public void viewContacts(){
            System.out.println(this.getFirst());
            System.out.println(this.getLast());
        }

}




