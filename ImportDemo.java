import java.util.Date;
//this imports the date class from the build in program
public class ImportDemo {
    public String getCurrentDate() {
        //publicly (globally) allowing the string getCurrentDate() to be a method
        Date date = new Date();
        //the type of variable date is Date. 
        /*this establishes that every time the variable date is invoked 
        we get a new instance of the current date */
        return "Current Date is: " + date;
    }
}