import java.util.ArrayList;
import java.util.Arrays;

public class Basics { 
    //print 1-255

    public ArrayList printAllInRange(int int1, int int2){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int i = int1;
        while(i < int2){
            newArray.add(i);
            i++;
        }
        return newArray;
    }

    // print odds

    public int[] printOdds(int number){
        //setting i to zero
        int i = 0; 
        //setting x to the number we feed printOdds in testing
        int x = number;
        //initializing an array
        int[] oddArray;
        
        //now we have to set how long we want the array
        //otherwise we will have no positions - x is the number of positions the array will have
        oddArray = new int[x];
        while(i < x){
            //this is setting the number of i to be 1 + the position we have initally given it
            oddArray[i] = i + 1;
            i++;
        }
        return oddArray;                        
    }
    
    //print sum

    public int getSum(int number1, int number2){
        int i = number1;
        int sum = 0;
        while(i < number2){ 
            sum += i;
            i++;
        }
        return sum;
    }

}