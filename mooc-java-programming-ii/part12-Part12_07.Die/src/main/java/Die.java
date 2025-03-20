
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        // generate a random number which may be any number
        return this.random.nextInt(numberOfFaces) +1;
        // between one and the number of faces, and then return it
        
    }
}
