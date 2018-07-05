import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeShould {

    TicTacToe ticTacToe;

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void verifyPlayerXgoesFirst() throws IllegalMoveException {
        assertEquals(true, ticTacToe.makeMark("X", 0, 0));
    }

    @Test(expected = IllegalMoveException.class)
    public void verifyPlayerOGoingFirstThrowsException() throws IllegalMoveException {
        assertEquals(true, ticTacToe.makeMark("O", 0, 0));
    }

//    @Test(expected = InvalidMoveException.class)
//    public void playerCannotPlayOnPlayedPosition() {
//    }

    @Test
    public void ensurePlayersAlternateTurns() throws IllegalMoveException {
        assertEquals(true, ticTacToe.makeMark("X", 0, 0));
        assertEquals(true, ticTacToe.makeMark("O", 0, 0));
    }

    @Test
    public void allowPlayersToMarkAPosition() throws IllegalMoveException {
        ticTacToe.makeMark("X", 0, 0);

        assertEquals("X", ticTacToe.getMarkAtPosition(0, 0));
    }
}
