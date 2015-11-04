import java.util.*;


/**
 * Created by DrScott on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};
        //reverse the array

      /*  for(int i = 0; i < names.length / 2; i++)
        {
            String newName = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = newName;
        }*/

        List<String> newNames = Arrays.asList(names);
        System.out.println(newNames);


        /*for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/


        //convert array into a hashmap
        HashMap<String, String> map = new HashMap();
        for (int i = 0; i < names.length; i += 2) {
            try {
                map.put(names[i], names[i + 1]);
            } catch (Exception e) {
            }
            System.out.println(map);


            //{"Jones" : "Charlie"} key is last name value is first name

        }
    }
}
