import java.util.ArrayList;

/**
 * Created by DrScott on 10/14/15.
 */
public class Exercise {
    public static void main(String[] args) {
        Contact alice = new Contact();
        Contact bob = new Contact();
        alice.name = "Alice";
        alice.age = 25;
        bob.name = "Bob";
        bob.age = 35;


        ArrayList<Contact> contacts = new ArrayList();
        //String[] contacts = {"Alice", "Bob", "Charlie", "Austin"}; // faster array creating method
        /*String[] contacts = new String[3];
        contacts[0] = "Alice";
        contacts[1] = "Bob";        //slower array creating
        contacts[2] = "Charlie";
        contacts[3] = "Austin";*/
        //int count = 0;
        contacts.add(alice);
        contacts.add(bob);
        //contacts.add("Charlie");      //adding things to an arraylist
        //contacts.add("Austin");
        //for is used to loop arrays
        for (Contact contact : contacts) {//first var is what you're the specific item you're looking at the second var is the collection
            //String nameString = (String) contact;  //casting: telling java to treat this object as a string
            if (contact.name.startsWith("A")) {
                System.out.println(contact.name);
            }
        }
    }
}