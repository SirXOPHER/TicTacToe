public class TicTacToe {

    private String currentPlayer;

    public TicTacToe() {
        currentPlayer = "X";
    }

    public boolean makeMark(String player) throws IllegalMoveException {
        if (player.equals(currentPlayer) == false) {
            throw new IllegalMoveException();
        }

        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

        return true;
    }
}
