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

//    @Test(expected = InvalidMoveException.class)
//    public void playerCannotPlayOnPlayedPosition() {
//    }

    @Test
    public void ensurePlayersAlternateTurns() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(true,ticTacToe.makeMark("X"));
        assertEquals(true,ticTacToe.makeMark("O"));
    }
}
