package practice;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner("34 23 45 \n 456 90");

        //int sum_  =0;
        while (sc.hasNextInt()) {

            int val = sc.nextInt();
            //sum_+=  val;

            System.out.println(val);

            //  }

            //sc.hasNextInt();

        }
    }
}
