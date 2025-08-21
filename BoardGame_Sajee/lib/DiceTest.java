package lib;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testAddDie() {
        Dice dice = new Dice();
        Die firstDie = new Die();
        Die secondDie = new Die();

        dice.addDie(firstDie);
        dice.addDie(secondDie);

        assertEquals(2, dice.getDiceCount(), "Number of dice should be 2");
    }

    @Test
    public void testGetDieAt() {
        Dice dice = new Dice();
        Die firstDie = new Die();
        Die secondDie = new Die();

        dice.addDie(firstDie);
        dice.addDie(secondDie);

        assertEquals(firstDie, dice.getDieAt(0), "getDieAt(0) should return the first die");
        assertEquals(secondDie, dice.getDieAt(1), "getDieAt(1) should return the second die");
    }

    @Test
    public void testRollAll() {
        Dice dice = new Dice();
        Die firstDie = new Die();
        Die secondDie = new Die();

        dice.addDie(firstDie);
        dice.addDie(secondDie);

        int result = dice.rollAll();
        assertTrue(result >= 2 && result <= 12, "Total roll value must be between 2 and 12");
    }

    @Test
    public void testGetLastTotal() {
        Dice dice = new Dice();
        Die firstDie = new Die();
        Die secondDie = new Die();

        dice.addDie(firstDie);
        dice.addDie(secondDie);

        dice.rollAll();
        int sum = dice.getLastTotal();

        assertTrue(sum >= 2 && sum <= 12, "Total last roll must be between 2 and 12");
    }

    @Test
    public void testAllDiceMatch() {
        Dice dice = new Dice();
        Die firstDie = new Die();
        Die secondDie = new Die();

        dice.addDie(firstDie);
        dice.addDie(secondDie);

        // Ensure both dice roll the same value
        do {
            firstDie.roll();
            secondDie.roll();
        } while (firstDie.getLastRoll() != secondDie.getLastRoll());

        assertTrue(dice.allDiceMatch(), "All dice should show identical values");
    }
}
