package lib;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {

    @Test
    public void testRoll() {
        Die die = new Die();
        int rollValue = die.roll();
        assertTrue(rollValue >= 1 && rollValue <= 6, "Roll value should be between 1 and 6");
        assertEquals(rollValue, die.getLastRoll(), "getLastRoll() should return the last rolled value");
    }
}
