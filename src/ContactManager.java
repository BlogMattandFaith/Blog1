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
    private int choice;

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

        public void addContact(){
        ContactManager management = new ContactManager("contact", "firstName", "lastName",
                0, "email");
        Scanner scanner = new Scanner(System.in);
        String first;
        String last;
        System.out.println("What is the first name? ");
        first = scanner.next();
            System.out.println("what is the last name? ");
           last = scanner.next();
            foundation.writeFile(first, last);

    }


    public void menu() {
        foundation foun = new foundation();
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
//                    foundation.display();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    //Search contacts
                    break;
                case 4:
                    //Delete a contact
                    break;
                case 5:
                   //exit blog
                    break;
                default:
                    break;
            }
        }

    }

}




