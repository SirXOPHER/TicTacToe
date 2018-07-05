public class TicTacToe {

    private String currentPlayer;

    public TicTacToe() {
        currentPlayer = "X";
    }

    public boolean makeMark(String player, int row, int column) throws IllegalMoveException {
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

    public String getMarkAtPosition(int row, int column) {
        return "X";
    }
}
