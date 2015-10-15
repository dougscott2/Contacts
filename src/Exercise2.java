import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by DrScott on 10/15/15.
 */
public class Exercise2 {
    //static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in); //makin a scanner
       // sayHello(scanner);
        HashMap<String , ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
           // String firstLetter = name.substring(0,1);
            String firstLetter = String.valueOf(name.charAt(0));  //two options for getting the first letter
            ArrayList<String> list = groups.get(firstLetter); //creates array list called list and gets the
            if (list == null){
                list = new ArrayList();
                list.add(name); //adds name from words[] into list
                groups.put(firstLetter, list); //stroing it in hashmap
            } else {
                list.add(name);
            }
            System.out.println(groups);
        }
        //System.out.println(groups);
    }

    static void sayHello(Scanner scanner){
        String answer = ""; //making a string that is pre assiged a value
        while (!answer.equals("hello")){ //we know string actually equals "" so it !equals...loop starts
            System.out.println("hey, say hello");//
            answer = scanner.nextLine();
        }
        System.out.println(String.format("You did it! you said '%s' ", answer));
        System.exit(0);
    }
}
