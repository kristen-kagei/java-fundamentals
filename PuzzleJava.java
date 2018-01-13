import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Collections;
import java.util.Random;
import java.lang.Math; 

public class PuzzleJava{

    //1. create array with values 3,5,1,2,7,9,8,13,25,32.
    //print sum of all numbers in the array
    //return array with numbers greater than 10
    public void puzzle1(int[] array){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
            if(array[i]>10){
                newArr.add(array[i]);
            }
        }
        System.out.println(sum);
        System.out.println(newArr);
    }

    //2. Create an array with Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa.
    //Shuffle array and print name of each person.
    //return array with names longer than 5 characters
    public void puzzle2(String[] array, int x){
        ArrayList<String> newArray = new ArrayList<String>();
        Random r = new Random();
        for(int i = x-1; i > 0; i--){
            int j = r.nextInt(i);
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            int length = array[i].length();
            if(length>5){
                newArray.add(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(newArray);
        
    }

    //3. create array with all 26 letters of alphabet
    // shuffle array and display last letter of array. 
    //display first letter of array. 
    //if first letter of array is vowel, display message
    public void puzzle3(char[] array, int x){
        Random r = new Random();
        for(int i = x-1; i>0; i--){
            int j = r.nextInt(i);
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[array.length-1]);
        if(array[0] == 'a' || array[0] == 'e' || array[0] == 'i' || array[0] == 'o' || array[0] =='u'){
            System.out.println(array[0]);
        }
    }

    //4. generate and return array with 10 random numbers between 55-100
    public ArrayList<Integer> puzzle4(int startNum, int endNum, int indexNum){
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < indexNum; i++){
            int random = r.nextInt(endNum-startNum+1)+startNum;
            myArr.add(random);
        }
        System.out.println(myArr);
        return myArr;
    }

    //5. Generate and return an array with 10 random numbers between 55-100
    //sort array (smallest to largest)
    //display all numbers 
    //display minimum and maximum values
    public void puzzle5(ArrayList<Integer> lastArray){
        int temp;
        for(int i = 0; i < lastArray.size()-1; i++){
            for(int j = i+1; j<lastArray.size(); j++){
                if(lastArray.get(i) > lastArray.get(j)){
                    temp = lastArray.get(i);
                    lastArray.set(i,lastArray.get(j));
                    lastArray.set(j,temp);
                }
            }
        }
        System.out.println(lastArray);
    }
    
    //6. create random string that is 5 characters long
    public String puzzle6(String aToZ, int length){
        Random r = new Random();        
        StringBuilder randString= new StringBuilder();
        for(char i = 0; i < length; i++){
            int index=r.nextInt(aToZ.length());
            randString.append(aToZ.charAt(index));
        }
        System.out.println(randString.toString());
        return randString.toString();
    }

    //7. generate an array with 10 random strings that are each 5 characters long.
    public void puzzle7(String stringArray, int arrLength){
        ArrayList<String> arrayString = new ArrayList<String>();             
        for(int i = 0; i < arrLength; i++){
            String string = stringArray;            
            arrayString.add(string);
        }
        System.out.println(arrayString);
    }
}