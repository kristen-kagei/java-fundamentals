import java.util.ArrayList;
import java.util.Arrays;

public class BasicsTest {
    public static void main(String[] args){
        //print 1-255

        Basics slay = new Basics();
        ArrayList<Integer> newArray = slay.printAllInRange(1, 256);
        System.out.println(newArray.toString());
        // the println method likes to work with strings
        
        //print odds 1-255

        //slaay has a new instance of Basics (which returns an array)
        Basics slaay = new Basics();
        //initializing another array and feeding it the number it needs
        int[] oddArray = slaay.printOdds(256);
        //still not sure why we need this logic here, but ok
        for (int i = 0; i < oddArray.length; i++){
            if(oddArray[i] % 2 != 0){
                System.out.println(oddArray[i]);
            }
        }

        Basics slaaay = new Basics();
        int sum = slaaay.getSum(0,255);
        System.out.println(sum);
        

        //iterating through an array
        for(int p = 0; p < oddArray.length; p++){
            System.out.println(p);
        }
        int max = oddArray[0];

        //max
        for(int q = 0; q < oddArray.length; q++){
           if(oddArray[q] > max){
               max = oddArray[q];
           }
        }
        System.out.println(max);

       //average
        int average = sum / oddArray.length;
        System.out.println(average);

       //odd numbers
        ArrayList<Integer> y = slaay.printOdds(256);

    }
}