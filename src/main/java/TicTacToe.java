public class TicTacToe {

    private String currentPlayer;
    private String[][] board;

    public TicTacToe() {
        currentPlayer = "X";
        board = new String[3][3];
    }

    public boolean makeMark(String player, int row, int column) throws IllegalMoveException {
        if (player.equals(currentPlayer) == false) {
            throw new IllegalMoveException();
        }

        board[row][column] = player;

        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }

        return true;
    }

    public String getMarkAtPosition(int row, int column) {
        return board[row][column];
    }
}
