import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class foundation {
   public static ContactManager management = new ContactManager();

    public static void main(String[] args) {


    }


//    private static String display() {
////        return null;
    }

//        public static String display (ContactManager.User user){
//            return "--------------------" +
//                    "\n  name:  " + user.getContact() +
//                    "\n  email: " + user.getEmail();
//
//        }
        public void newFile(Iterable<? extends String> contact) {
static void newFile() {

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




            public static void writeFile() {
                contact.forEach("Jim");
                contact.("Joe");
                for (String fr : contact)
                    System.out.println(fr);
                try {
                    Path info = Paths.get("data", "contact.txt");
                    Files.write(info, contact);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                contact.add("John");
                contact.add("Jack");
                try {
                    Path info = Paths.get("data", "contact.txt");
                    Files.write(info, contact);
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

        public static String display() {
            return "--------------------" +
                    "\n  name:  " + management.getContact() +
                    "\n  email: " + management.getEmail();


        }

            //program to interfaces versus implementation
            public static void writeFile() {

                management.getContact().add("Jim");
                management.getContact().add("Joe");
                for (String fr : management.getContact())
                    System.out.println(fr);
                try {
                    Path info = Paths.get("data", "contact.txt");
                    Files.write(info, management.getContact());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                management.getContact().add("John");
                management.getContact().add("Jack");
                try {
                    Path info = Paths.get("data", "contact.txt");
                    Files.write(info, management.getContact());
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
}














