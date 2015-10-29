import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by DrScott on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie",
                "david", "allan", "barbie", "colin", "dan"));

        //take the first 5 names //make an array list of only the first five names in one command
        names = new ArrayList(names.subList(0,5));
        solveViaStream(names);
        solveViaTempLists(names);
        solveViaDirectModification(names);

    }//end main

    static void solveViaDirectModification(ArrayList<String> names){
        //make every string in arraylist uppercase
        for (int i= 0; i<names.size() ; i++ ) {
            String s = names.get(i).toUpperCase();
            names.set(i, s);
        }
        //remove the ones that start with A
        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(names);
    }//end solveViaDirectModification


    static void solveViaTempLists(ArrayList<String> names){
       //make every string uppercase
        ArrayList<String> tempNames = new ArrayList();
        for(String name : names){
            tempNames.add(name.toUpperCase());
        }
        names = tempNames;
        //remove the ones that start with A
        tempNames = new ArrayList(); //resets tempNames

        for (String name : names){
            if (!name.startsWith("A")){
                tempNames.add(name);
            }
            names = tempNames;
        }
        System.out.println(names);
    }//end solveViaTempLists

    static void solveViaStream(ArrayList<String> names){
        List<String> newNames =
                names
                .stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList());

        System.out.println(newNames);
    }

}//end Exercise 6 class
