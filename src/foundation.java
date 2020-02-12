
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class foundation {
public static ContactManager management = new ContactManager("contact", "firstName", "lastName",
        0, "email");




        static void newFile () {
            String directory = "data";
            String filename = "contact.txt";

            Path dataDirectory = Paths.get(directory);
            System.out.println(dataDirectory.toAbsolutePath());
            Path dataFile = Paths.get(directory, filename);


            try {
                if (Files.notExists(dataDirectory)) {
                    Files.createDirectories(dataDirectory);
                    System.out.println("Created Directory");
                }
                if (!Files.exists(dataFile)) {
                    Files.createFile(dataFile);
                    System.out.println("Created file");
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

            public static void writeFile () {
                management.getContact().add("Jim" + " Morrison");
                management.getContact().add("Joe" + " Young");
                management.getContact().add("John" + " Wick");
                management.getContact().add("Jack" + " Black");
                for (String fr : management.getContact())
                    System.out.println(fr);
                try {
                    Path info = Paths.get("data", "contact.txt");
                  Files.write(info, management.getContact());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

            public static void writeFile (String firstName, String lastName) {
                        management.getContact().add(firstName + " " + lastName);
                try {
                    Path info = Paths.get("data", "contact.txt");
                    Files.write(info, management.getContact());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }


            public static void display ()  {
//                System.out.println( "--------------------" +
//                        "\n  name:  " + new String(Files.(Paths.get("contact.txt"))));
                System.out.println(new String(Files.readAllBytes(Paths.get("contact.txt"))));


            }

    public static void main(String[] args) {
        display();
    }

}












