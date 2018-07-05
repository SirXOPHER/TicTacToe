public class TicTacToe {

    private String currentPlayer;

    public TicTacToe() {
        currentPlayer = "X";
    }

    public boolean makeMark(String player) throws IllegalArgumentException {
        if (!player.equals(currentPlayer)) {
            throw new IllegalArgumentException();
        }

        if (currentPlayer == "X") {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

        return true;
    }
}
