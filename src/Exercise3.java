import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by DrScott on 10/19/15.
 */
public class Exercise3 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        HashMap<String, ArrayList<Contact>> people = new HashMap();

        for (String name : names){
            for (String name2 : names){
                if (!name.equals(name2)){
                    Contact c = new Contact(name2, 0);
                    ArrayList <Contact> list = people.get(name);
                    if (list == null){
                        list = new ArrayList();
                        list.add(c);
                        people.put(name, list);
                    } else {
                        list.add(c);
                    }
                }
            }
        }

        System.out.println();
        double randNum = Math.random();
        int index = (int) (randNum * 4);
        System.out.println(names[index]);

        Random rand = new Random();
        index = rand.nextInt(4); //gives random number between 0 and 3
        System.out.println(names[index]);

    }//end main
}//end class
