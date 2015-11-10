import java.util.ArrayList;

/**
 * Created by DrScott on 11/10/15.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int num = 12345;

        String numString = String.valueOf(num);
        String[] numArray = numString.split("");
        ArrayList<String> revList = new ArrayList();
        String numStrReversed= new StringBuilder(numString).reverse().toString();


        int x = numArray.length;
        int numRev = 0;
        String numRev2;
        while(num!=0){
            numRev = numRev *10;
            numRev = numRev + num%10;
            num = num/10;
        }





        System.out.println(numRev);
        System.out.println(numStrReversed);




        //int numReversed = 54321;
    }
}
