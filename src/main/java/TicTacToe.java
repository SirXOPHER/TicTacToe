import org.apache.commons.lang3.NotImplementedException;

public class TicTacToe {


    public boolean makeMark(String player) throws IllegalArgumentException {
        if (player.equals("O")) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
