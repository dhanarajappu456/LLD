package snakeladder;

import java.util.Random;

public class Board {

    Cell[][] cells;

    Board(int boardSize, int snakeCount, int laddercount) {
        initializeCells(boardSize);
        addSnakeLadder(boardSize, snakeCount, laddercount);


    }

    void initializeCells(int boardSize) {

        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    void addSnakeLadder(int boardSize, int snakeCount, int ladderCount) {

        Random rand = new Random();

        while (snakeCount > 0) {

            int start = rand.nextInt(0, boardSize * boardSize), end = rand.nextInt(0, boardSize * boardSize);
            // to add snake head at a cell it should  be
            // not the final cell and no snake or ladder was there before , and the end<start
            //remember start for snake means its head
            if (start != boardSize * boardSize - 1 && end < start) {
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                //add if no snake already present
                if (jump != null) {
                    cell.jump = jump;
                    snakeCount--;
                }


            }

        }

        while (ladderCount > 0) {

            int start = rand.nextInt(0, boardSize * boardSize), end = rand.nextInt(0, boardSize * boardSize);
            // to add ladder foot at a cell it should  be
            //no snake or ladder was there before , and the end>start
            //remember start for ladder  means its foot
            if (end < start) {
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                //add if no snake already present
                if (jump != null) {
                    cell.jump = jump;
                    ladderCount--;
                }


            }

        }


    }

    Cell getCell(int pos) {

        int row = pos / 10, col = pos % 10;

        return cells[row][col];
    }

}
