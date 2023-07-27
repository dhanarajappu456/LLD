package design.tictactoe.model;

public abstract class Board {

    public int size;
    public Piece[][] board;

    Board(int size) {
        this.size = size;

    }


    public abstract void printBoard();


}
