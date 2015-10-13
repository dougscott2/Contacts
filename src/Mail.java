/**
 * Created by DrScott on 10/8/15.
 */
public class Mail {
    //fields
    public String subject;
    public String body;
    public String address;
    public int timeStamp;
//constructors go after fields, but before methods

    public Mail(){
        System.out.println("I'm a making an email!");
        subject = "no subject";
        body = "";
        address = "...";
        timeStamp = 0;


    }

    public Mail( String subject, String body, String address, int timeStamp) {//2nd constructor
        this.subject = subject;
        this.body = body;
        this.address = address;
        this.timeStamp = timeStamp;

    }

        //methods
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddressAddress(){
        return address;
    }

    public void setTimeStamp(int timeStamp){
        this.timeStamp = timeStamp;
    }

    public int getTimeStamp(){
        return timeStamp;
    }

    public void setBody(String newBody){
        body = newBody;
    }
    public String getBody(){
        return body;
    }
public void setSubject(String subject){
    this.subject = subject;
}
//static methods
//should be up up there with the fields
    public static boolean isValidBody(String body) {
        return body.length() != 0;

    }
    public boolean isValidBody(){
        return isValidBody(body);
    }

}
