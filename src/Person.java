/**
 * Created by DrScott on 10/8/15.
 */
public class Person {
    public String name;
    public int age;
    public double height;
    public Author author;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}

class Author {
    public String name;
    public String[] books;
}