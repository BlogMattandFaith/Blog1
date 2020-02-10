import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class foundation {

    private static List<String> contact;
    private String  firstName;
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


    public static void main(String[] args) {
        ViewContacts viewAll = new ViewContacts();
        newFile();
        writeFile();
        viewAll.mainMenu();

    }




        static void newFile(){
            String directory = "data";
            String filename = "contact.txt";

            Path dataDirectory = Paths.get(directory);
            System.out.println(dataDirectory.toAbsolutePath());
            Path dataFile = Paths.get(directory, filename);



            try{
                if(Files.notExists(dataDirectory)) {
                    Files.createDirectories(dataDirectory);
                    System.out.println("Created Directory");
                }
                if(!Files.exists(dataFile)) {
                    Files.createFile(dataFile);
                    System.out.println("Created file");
                }
            }catch (IOException ioe){
                ioe.printStackTrace();
            }

        }


    //program to interfaces versus implementation
    public static void writeFile() {
            contact.add("Jim");
            contact.add("Joe");
        for (String fr : contact)
            System.out.println(fr);
        try {
            Path info = Paths.get("data", "contact.txt");
            Files.write(info, contact);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        contact.add("John"); contact.add("Jack");
        try {
            Path info = Paths.get("data", "contact.txt");
            Files.write(info, contact);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }







    }

