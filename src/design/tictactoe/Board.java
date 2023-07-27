package design.tictactoe;

public abstract class Board {

    int size;
    Piece[][] board;

    Board(int size) {
        this.size = size;

    }


    public abstract void printBoard();


}
