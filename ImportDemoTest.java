public class ImportDemoTest {
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}

/* ImportDemo and ImportDemoTest are 
separated. We want to be able to have class information
and the testing/running information in two files
to allow us to modularize our code 