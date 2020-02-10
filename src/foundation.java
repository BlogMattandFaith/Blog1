import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class foundation {


    public static void main(String[] args) {
        newFile();
        writeFile();

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
    static void writeFile() {
        List<String> contact = new ArrayList<>();
            contact.add("Jim");
            contact.add("Joe");
        for (String fr : contact)
            System.out.println(fr);
        try {
            Path info = Paths.get("data", "info.txt");
            Files.write(info, contact);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        contact.add("John"); contact.add("Jack");
        try {
            Path info = Paths.get("data", "info.txt");
            Files.write(info, contact);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }





    }

