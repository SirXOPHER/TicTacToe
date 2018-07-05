public class TicTacToe {

    private String currentPlayer;
    private String[][] board;

    public TicTacToe() {
        currentPlayer = "X";
        board = new String[3][3];
    }

    public void makeMark(String player, int row, int column) throws IllegalMoveException, InvalidCurrentPlayerException {
        if (player.equals(currentPlayer) == false) {
            throw new InvalidCurrentPlayerException();
        }

        board[row][column] = player;

        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }

    public String getMarkAtPosition(int row, int column) {
        return board[row][column];
    }
}
