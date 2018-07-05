import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeShould {

    @Test
    public void verifyPlayerXgoesFirst() {
        assertEquals(true, new TicTacToe().makeMark("X"));
    }
}
