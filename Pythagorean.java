import java.lang.Math; 

public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB){
        legA *= legA;
        legB *= legB;
        double hypotenuse = Math.sqrt(legA + legB);
        return hypotenuse;
    }
}

