public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number % 3 == 0 && number % 5 != 0) {
            System.out.println("Fizz");
        } else if(number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        } else if(number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(number);
        } 
        //not sure what to return here. Can't be just the int
        //and there isn't anything else instruction wise.
        return "";
    }
}