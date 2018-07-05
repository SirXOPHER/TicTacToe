import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeShould {

    @Test
    public void verifyPlayerXgoesFirst() {
        assertEquals(true, new TicTacToe().makeMark("X"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyPlayerOGoingFirstThrowsException() {
        assertEquals(true, new TicTacToe().makeMark("O"));
    }
}
