package snakeladder;

import java.util.Random;

public class Dice {
    int numberOfDice;
    int min = 1;
    int max = 6;

    Dice(int diceCount) {
        this.numberOfDice = diceCount;
    }

    int roll() {
        Random random = new Random();
        int val = random.nextInt(min, max + 1);
        //System.out.print(min + "  " + max);
        return val;

    }
}
