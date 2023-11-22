package snakeladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    int n;
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();

    Player winner;

    public Game(int boardSize, int playerCount, int diceCount, int snakeCount, int ladderCount) {

        initializeGame(boardSize, playerCount, diceCount, snakeCount, ladderCount);


    }

    void initializeGame(int boardSize, int playerCount, int diceCount, int snakeCount, int ladderCount) {
        n = boardSize;
        //initialise board
        board = new Board(boardSize, snakeCount, ladderCount);
        //init players
        addPlayers(playerCount);
        //init dice
        dice = new Dice(1);

    }

    void addPlayers(int playerCount) {
        while (playerCount > 0) {
            players.add(new Player("Daan"));
            players.add(new Player("Tony"));
            playerCount--;
        }

    }


    void startGame() {
        //play game for each player
        //check the new position, if it has snake or ladder move accordingly
        while (winner == null) {
            Player currPlayer = getPlayer();
            System.out.println(currPlayer.name + " " + "is playing");
            int diceValue = dice.roll();
            int newPosition = currPlayer.position + diceValue;

            //calculates the position based on snake , ladder
            newPosition = calculatePosition(newPosition);
            System.out.println("The current position is " + newPosition);
            currPlayer.position = newPosition;

            if (newPosition >= n * n) {
                winner = currPlayer;
            }


        }
        System.out.println("The winner is : " + winner.name);


    }

    Player getPlayer() {
        Player currPlayer = players.removeFirst();
        players.addLast(currPlayer);
        return currPlayer;

    }

    int calculatePosition(int position) {

        int newPosition = position;
        if (newPosition >= n * n) {
            return newPosition;
        }
        Cell cell = board.getCell(position);
        if (cell.jump != null) {
            newPosition = cell.jump.end;
        }
        return newPosition;
    }
}
