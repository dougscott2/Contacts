import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by DrScott on 10/13/15.
 */
public class Contacts {
    public static void main(String[] args){//dat sweet sweet main function
        Contact bob = new Contact("Bob",30);
        Contact alice = new Contact("Alice", 20);
        Contact charlie = new Contact("Charlie", 15);

        ArrayList<Contact> contacts = new ArrayList();
        contacts.add(bob);
        contacts.add(alice);
        contacts.add(charlie);

        ArrayList<Contact> contactsUnderThirty = new ArrayList();

        Contact contactToFind = null;
        for (Contact c : contacts ){ //: means in. Temporary c in the array list called contacts
            if (c.age < 30 ){
                contactsUnderThirty.add(c);
            }
           // contactToFind = c;
        }

        HashMap<String, Contact> contactMap = new HashMap();
        contactMap.put("Bob",bob);
        contactMap.put("Alice", alice);
        contactMap.put("Charlie", charlie);

        //contactToFind = contactMap.get("Alice");


        if (contactToFind == null){
            System.out.println("Contact not found");
        } else {
            System.out.println("We found your contact");
        }
    }
}
