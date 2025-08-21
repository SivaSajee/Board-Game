package lib;
import java.util.ArrayList;
import java.util.List;

public class Dice {

    private final List<Die> diceSet; // Collection of dice

    // Constructor
    public Dice() {
        this.diceSet = new ArrayList<>();
    }

    // Adds a die to the collection
    public void addDie(Die die) {
        diceSet.add(die);
    }

    // Returns the number of dice in the collection
    public int getDiceCount() {
        return diceSet.size();
    }

    // Retrieves a die at a given index
    public Die getDieAt(int index) {
        if (index >= 0 && index < diceSet.size()) {
            return diceSet.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid dice index: " + index);
    }

    // Rolls all dice and returns the sum of their values
    public int rollAll() {
        int sum = 0;
        for (Die die : diceSet) {
            sum += die.roll();
        }
        return sum;
    }

    // Retrieves the total of the last rolled values of all dice
    public int getLastTotal() {
        int sum = 0;
        for (Die die : diceSet) {
            sum += die.getLastRoll();
        }
        return sum;
    }

    // Checks if all dice have the same last roll value
    public boolean allDiceMatch() {
        if (diceSet.isEmpty()) {
            return false;
        }
        int firstValue = diceSet.get(0).getLastRoll();
        for (Die die : diceSet) {
            if (die.getLastRoll() != firstValue) {
                return false;
            }
        }
        return true;
    }
}
