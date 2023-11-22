package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting {

    public static void main(String[] args) {

        Integer intArr[] = { 15, 22, 35  , 10, 20};


        Comparator<Integer>  cmp  = new Comparator<Integer>() {
            @Override
            public int compare(Integer one, Integer two) {
                //sorts based on last digit
                int value  = Integer.compare(one%10, two%10);
                //incase of tie, sort them based on the ascending order
                return value!=0?value : one.compareTo(two);



            }
        };
        Arrays.sort(intArr, cmp);
        System.out.println(Arrays.toString(intArr));
        //trying  - bin search
        int ind  = Arrays.binarySearch(intArr,35);
        System.out.println("found at: " + ind);



    }

}
