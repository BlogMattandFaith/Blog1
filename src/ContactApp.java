import java.util.Scanner;

public class ContactApp {
    public static ContactManager management = new ContactManager("contact", "firstName", "lastName",
            0, "email");
    public static foundation app = new foundation();
   public Scanner in = new Scanner(System.in);
    public String writeOption;

    public static void main(String[] args) {
        ContactApp app2 = new ContactApp();
        app2.blogger();



    }


    public void blogger() {
        do {
            System.out.println("1. View contacts.");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            writeOption = in.nextLine();
            if (writeOption.equals("0"))
                foundation.display();
            foundation.newFile();
            foundation.writeFile();
        } while (!writeOption.equals("5"));
    }

}