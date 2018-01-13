import java.util.ArrayList; 
import java.util.Arrays; 

public class PuzzleJavaTest { 
    public static void main(String[] args){
        PuzzleJava manipulator = new PuzzleJava();

        //1. Puzzle 1
        int[] array1 = {3,5,1,2,7,9,8,13,25,32};
        manipulator.puzzle1(array1);

        //2. Puzzle2
        String[] array2 = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        int x = array2.length;
        manipulator.puzzle2(array2, x);

        //3. Puzzle3
        char[] array3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int z = array3.length;
        manipulator.puzzle3(array3, z);

        //4. Puzzle4
        manipulator.puzzle4(55, 100, 10);

        //5. Puzzle5
        ArrayList<Integer> array5 = manipulator.puzzle4(55, 100, 10);
        manipulator.puzzle5(array5);

        //6. Puzzle6
        int length = 5;
        String aToZ = "abcdefghijklmnopqrstuvwxyz";
        manipulator.puzzle6(aToZ, length);

        //7. Puzzle7
        String randString = manipulator.puzzle6(aToZ, length);
        int arrLength = 10;   
        
        manipulator.puzzle7(randString, arrLength);
    }
} 