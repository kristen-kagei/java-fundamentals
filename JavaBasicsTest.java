import java.util.ArrayList; 
import java.util.Arrays; 

public class JavaBasicsTest {
    public static void main(String[] args){
        JavaBasics manipulator = new JavaBasics();
        //1. print 1-255
        manipulator.getAllNumbers(256);
        //2. print odd
        manipulator.getOddNumbers(256);
        //3. print sum
        manipulator.getSum(256);
        //4. iterate through given array
        int[] givenArray = {1,3,5,7,9,13};
        manipulator.iterateArray(givenArray);
        //5. find maximum value in array
        int[] arrayMax = {0,1,-3,5,7,9,-13};
        manipulator.maxValue(arrayMax);
        //6. get average
        int[] arrayAvg = {0,1,3,5,7,9,13};
        manipulator.getAverage(arrayAvg);
        //7. get odd array
        manipulator.getOdd(255);
        //8. value greater than given value y
        int[] greaterArray = {6,7,9,2,3,5};
        manipulator.greaterValue(greaterArray, 4);
        //9. square values
        int[] squareArray = {2,4,6,8};
        manipulator.squareMe(squareArray);
        //10. eliminate negative numbers; 
        int[] negativeArray = {8,-6,-8,8,5};
        manipulator.negatives(negativeArray);
        //11. max, min, average;
        int[] maxMinAvgArray = {1, 5, 10, -2};
        manipulator.maxMinAvg(maxMinAvgArray);
        //12. Shift Values in Array
        int[] shiftArray = {1, 5, 10, 7, -2};
        manipulator.shiftyPoo(shiftArray);
    }
}