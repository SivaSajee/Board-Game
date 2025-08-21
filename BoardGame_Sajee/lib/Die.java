package lib;
import java.util.Random;

public class Die {

    private int lastRoll; // Stores the last rolled value

    // Constructor
    public Die() {
        this.lastRoll = 0; // Initialize to 0 (no roll yet)
    }

    // Roll the die and return a random value between 1 and 6
    public int roll() {
        Random random = new Random();
        this.lastRoll = random.nextInt(6) + 1; // Random number between 1 and 6
        return this.lastRoll;
    }

    // Get the last rolled value
    public int getLastRoll() {
        return this.lastRoll;
    }
}
