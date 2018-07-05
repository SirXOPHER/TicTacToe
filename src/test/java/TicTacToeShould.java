import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeShould {

    TicTacToe ticTacToe;

    @Before
    public void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test(expected = InvalidCurrentPlayerException.class)
    public void verifyPlayerOGoingFirstThrowsException() throws IllegalMoveException, InvalidCurrentPlayerException {
        ticTacToe.makeMark("O", 0, 0);
    }

//    @Test(expected = InvalidMoveException.class)
//    public void playerCannotPlayOnPlayedPosition() {
//    }

    @Test(expected = InvalidCurrentPlayerException.class)
    public void ensurePlayersAlternateTurns() throws IllegalMoveException , InvalidCurrentPlayerException {
        ticTacToe.makeMark("X", 0, 0);
        ticTacToe.makeMark("O", 0, 0);
        ticTacToe.makeMark("O", 0, 0);
    }

    @Test
    public void allowPlayersToMarkAPosition() throws IllegalMoveException, InvalidCurrentPlayerException {
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
