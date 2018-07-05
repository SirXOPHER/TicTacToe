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

    // TODO: in refactor, kill this assert (not necessary)
    // TODO: refactor: change exception type
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
        ticTacToe.makeMark("O", 1, 1);

        assertEquals("X", ticTacToe.getMarkAtPosition(0, 0));
        assertEquals("O", ticTacToe.getMarkAtPosition(1, 1));
    }

//    @Test(expected = IllegalMoveException.class)
//    public void ensurePlayersCannotPlayOnAPlayedPosition() throws IllegalMoveException {
//        ticTacToe.makeMark("X", 0, 0);
//        ticTacToe.makeMark("O", 0, 0);
//    }
}
