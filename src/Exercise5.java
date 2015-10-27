import java.util.ArrayList;

/**
 * Created by DrScott on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question.";


        // remove commas and periods
        s = s.replace(",","").replace(".","");
        // make it all lower case
        s= s.toLowerCase();
        //then split into words
        String[] words = s.split(" ");
        // remove duplicate words
        ArrayList<String> newWords = new ArrayList();
        for (String word : words){
            if (!newWords.contains(word)){
                newWords.add(word);
            }
        }
        //create a new string without duplicate words
        String newStr = "";
        for (String newWord : newWords){
            if (!newStr.isEmpty()) {
                newStr += " ";
            }
            newStr += newWord;
        }
        //print out the new sentence without duplicates
        System.out.println(newStr);










    }
}
