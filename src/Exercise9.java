import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by DrScott on 11/4/15.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList();
        String[] sorted = new String[5];

        for(String name : names){
            int index = 0;
            for (String sortedName : sortedNames){
                if (name.compareTo(sortedName) > 0){
                   index++;
                } else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);





    }//end main
}//end Exercise9
