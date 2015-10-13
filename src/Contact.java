/**
 * Created by DrScott on 10/7/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {     //constructor
        this.name = "Doug";
        this.email = "dougscott2@gmail.com";
    }

    public Contact(String name, String address, String email, int age) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getName() {   //getter/setter stuff  beneficial as a validation step if you're making something for someone else
        return this.name;

    }

    public void setName(String name) {
        this.name = name;  //this refers to the public class name

    }

    public static boolean isValidName(String name) { //static method that can be called without the class or something
        return name.length() != 0;
    }



}



