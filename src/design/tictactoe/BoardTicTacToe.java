package design.tictactoe;

public class BoardTicTacToe extends Board {

    public BoardTicTacToe(int size) {

        super(size);

        this.board = new Piece[size][size];

    }

    @Override
    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("    ");

                } else {

                    System.out.print(board[i][j].name + "   ");

                }
                System.out.print("| ");
            }
            System.out.println("\n");

        }

    }

    Boolean checkBoardFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false;
                }

            }
        }
        return true;
    }

    Boolean checkAlreadyOccupied(int x, int y) {


        return board[x][y] != null;
    }

    void addPiece(int x, int y, Piece piece) {
        board[x][y] = piece;
    }


}

