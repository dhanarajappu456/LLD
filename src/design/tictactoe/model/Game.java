package design.tictactoe.model;

import java.util.*;

public class Game {

    public BoardTicTacToe board;
    Deque<Player> players = new LinkedList<>();

    public Game() {
        initializeGame();

    }

    public void initializeGame() {
        // initialize the board and players
        System.out.println("Enter board size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        board = new BoardTicTacToe(size);

        players.add(new Player1("john", new PieceX()));
        players.add(new Player2("don", new PieceO()));


    }

    public void startGame() {

        //while True play the game

        while (true) {

            Player currPlayer = players.removeFirst();

            board.printBoard();
            System.out.println("Enter the desired position please");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            String[] choice1 = choice.split(",");

            int x = Integer.valueOf(choice1[0]);
            int y = Integer.valueOf(choice1[1]);
            // checks for out of bounds
            if (x >= board.size || y >= board.size) {
                System.out.println("The board  has only a size of " + board.size + " try another position");
                players.addFirst(currPlayer);
                continue;
            }//checks for full - board condition
            if (board.checkBoardFull()) {

                System.out.println("hmm... seems like a tie");
                break;
            }

            // checks if the selected position is already filled
            if (board.checkAlreadyOccupied(x, y)) {
                System.out.println("try another position");
                players.addFirst(currPlayer);
                continue;

            }
            board.addPiece(x, y, currPlayer.piece);
            if (checkIfWinner(x, y, currPlayer)) {
                System.out.println(currPlayer.name + "  wins...  ");
                return;
            }
            players.addLast(currPlayer);


        }


        //algo:
        //pop each player from the queue and later putback
        // ask for the place to put the piece at
        // check if the board is full - tie
        // if already filled  continue asking again to put
        // valid put - >add the piece then check for the winner


    }

    boolean checkIfWinner(int x, int y, Player player) {

        // check row
        boolean winInRow = true, winInCol = true, winInDiag = true, winInAntiDiag = true;

        for (int i = 0; i < board.size; i++) {


            if (board.board[x][i] == null || !(board.board[x][i].name.equals(player.piece.name))) {
                winInRow = false;
                break;

            }

        }
        //checks col
        for (int i = 0; i < board.size; i++) {


            if (board.board[i][y] == null || !(board.board[i][y].name.equals(player.piece.name))) {
                winInCol = false;
                break;

            }

        }

        // check +ve diagonal

        for (int i = 0; i < board.size; i++) {


            if (board.board[i][i] == null || !(board.board[i][i].name.equals(player.piece.name))) {
                winInDiag = false;
                break;

            }

        }
        // checks antidiagonal
        for (int i = 0; i < board.size; i++) {


            if (board.board[i][board.size - 1 - i] == null || !(board.board[i][board.size - 1 - i].name.equals(player.piece.name))) {
                winInAntiDiag = false;
                break;

            }

        }
        //if any of  these is true , then current player is winner
        return winInRow || winInCol || winInDiag || winInAntiDiag;


    }


}
