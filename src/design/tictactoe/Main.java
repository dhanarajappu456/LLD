package design.tictactoe;


public class Main {
    public static void main(String[] args) {

        Game g = new Game();
        g.startGame();
        //printing the board after a win
        g.board.printBoard();


    }
}