public class TicTacToe {

    private String currentPlayer;

    public TicTacToe() {
        currentPlayer = "X";
    }

    public boolean makeMark(String player) throws IllegalArgumentException {
        if (player.equals(currentPlayer) == false) {
            throw new IllegalArgumentException();
        }

        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

        return true;
    }
}
