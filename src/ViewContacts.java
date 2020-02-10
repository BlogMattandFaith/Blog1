import java.util.Scanner;

public class ViewContacts {
    foundation getterSetter = new foundation();
    Scanner scanner = new Scanner(System.in);
    String info;
    public void mainMenu() {
        int choice = 1;
        do {
            System.out.println("1. View contact");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5): ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                break;
            }
            switch (choice) {
                case  1:
                    System.out.printf("%s %s %d %s", getterSetter.getFirst(), getterSetter.getLast(), getterSetter.getContacts(),
                           getterSetter.getEmail());


            }

        } while(choice != 0);

    }



}