import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by DrScott on 10/14/15.
 */
public class ContactSaver {
    public static void main(String[] args) throws IOException {
        File f = new File("contact.txt");

        JsonSerializer serializer = new JsonSerializer();
        Contact bob = new Contact();
        bob.name = "Bob Loblaw";
        bob.age = 35;
        bob.address = "right here";
        bob.email = "bob@bob.com";
        String contentToSave = serializer.serialize(bob);
        FileWriter fw = new FileWriter(f);//creating filewriter object
        fw.write(contentToSave);//writing to a file
        fw.close();//have to close it
        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();  //wants to be a long (int) casts it and says do it as int
        char[] contents = new char[fileSize]; //create array of chars
        fr.read(contents);   //FileReader fr reads the file and puts the chars into char array
        String fileContents = new String(contents); //converts char array to single string
        //System.out.println(fileContents);

        JsonParser parser = new JsonParser();
        Contact newBob = parser.parse(fileContents, Contact.class);
        System.out.println(newBob.name);
    }
}
