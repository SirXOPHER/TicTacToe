import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeShould {

    @Test
    public void verifyPlayerXgoesFirst() throws IllegalMoveException {
        assertEquals(true, new TicTacToe().makeMark("X"));
    }

    @Test(expected = IllegalMoveException.class)
    public void verifyPlayerOGoingFirstThrowsException() throws IllegalMoveException {
        assertEquals(true, new TicTacToe().makeMark("O"));
    }

//    @Test(expected = InvalidMoveException.class)
//    public void playerCannotPlayOnPlayedPosition() {
//    }

    @Test
    public void ensurePlayersAlternateTurns() throws IllegalMoveException {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(true,ticTacToe.makeMark("X"));
        assertEquals(true,ticTacToe.makeMark("O"));
    }
}
