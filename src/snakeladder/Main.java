package snakeladder;

public class Main {
    public static void main(String[] args) {
        //boardSize , playerCount, diceCount,snakCount,ladderCount
        Game g = new Game(10, 2, 1, 4, 3);
        g.startGame();

    }

}
