import jodd.typeconverter.impl.SqlTimeConverter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by DrScott on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList();
        Scanner scanner = new Scanner(new File("people.csv"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //split line into array of columns
            String[] columns = line.split(",");
            //add first and last name to names
            names.add(columns[1] + " " + columns[2]);
        }
        String searchTerm = "ALI";

        ArrayList<String> results = new ArrayList();
        //fill up results with all names that contain search term (case sensitive)

        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
                results.add(name);
            }
        }
        System.out.println(results);
        final String searchTerm2 = searchTerm;
        List<String> results2 =
                names
                .parallelStream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm2.toLowerCase());
                })
                .collect(Collectors.toList());

        System.out.println(results2);



    }

}
