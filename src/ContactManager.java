import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
Scanner in = new Scanner(System.in);


    public class User {

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

        public User(){
            System.out.println("Enter you first name: ");
            this.firstName = in.nextLine();

            System.out.println("Enter your last name");
            this.lastName = in.nextLine();

        }
    }
}
