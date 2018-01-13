import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class JavaBasics {

//1. print 1-255
    public int getAllNumbers(int number){
        int i = 0;
        while(i < number){
            System.out.println(i);
            i++;
        }
        return i;
    }

//2. Print odd numbers from 1-255
    public void getOddNumbers(int num){
        int x = 1; 
        while(x < num){
            if(x%2 != 0){
                System.out.println(x);
            }
            x += 1;
        }
    }

//3. Print sum (so far)
    public void getSum(int num){
        int sum = 0;
        for(int j = 0; j < num; j++){
            sum = sum + j;
            System.out.println("New number: "+ j + " Sum: " + sum);
        }
    }

//4. Iterating through a given array
    public void iterateArray(int[] givenArray){
        for(int x = 0; x < givenArray.length; x++){
            System.out.println(givenArray[x]);
        }
    }

//5. find the maximum value in an array
    public void maxValue(int[] givenArray){
        int max = givenArray[0];
        for(int i = 0; i < givenArray.length; i++){
            if(givenArray[i]>max){
                max = givenArray[i];
            }
        }
        System.out.println(max);                                     
    }

//6. get average of values in array
    public void getAverage(int[] givenArray){
        int sum = 0; 
        for(int j = 0; j < givenArray.length; j++){
            sum = sum + givenArray[j];
        }
        float average = sum/(givenArray.length); 
        System.out.println(average);
    }

//7. get an array with odd numbers from 1-255
    public void getOdd(int number){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int x = 0; x < number+1; x++){
            if(x%2 != 0){
                y.add(x);
            }
            System.out.println(y);
        }
    }

//8. return number of values in array greater than given value
    public void greaterValue(int[] array, int y){
        int counter = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i] > y){
                counter += 1;
            }
            System.out.println(counter);
        }
    }
//9. square the values of an array 
    public void squareMe(int[] x){
        ArrayList<Integer> newSquare = new ArrayList<Integer>();
        for(int i = 0; i< x.length; i++){
            int newEye = x[i];
            newEye = newEye * newEye;
            newSquare.add(newEye);
        }
        System.out.println(newSquare);
    }
//10. eliminate negative numbers in an array
    public void negatives(int[] x){
        ArrayList<Integer> noNegs = new ArrayList<Integer>();        
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
            noNegs.add(x[i]);
            System.out.println(noNegs);
        }
    }

//11. get the maximum, minimum, and average of an array
    public void maxMinAvg(int[] x){
        ArrayList<Integer> newArray = new ArrayList<Integer>();               
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i]>max){
                max = x[i];
            }
            if(x[i] < max && x[i] < min){
                min = x[i];
            }
            sum += x[i];
        }
        newArray.add(max);
        newArray.add(min);
        int avg = sum / x.length;
        newArray.add(avg);
        System.out.println(newArray);
    }
//12. shift the values in an array by one to the front
    public void shiftyPoo(int[] x){
        ArrayList<Integer> shiftArray = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i++){
            x[i] = x[i+1];
            shiftArray.add(x[i]);
        }
        System.out.println(shiftArray);
    }
}