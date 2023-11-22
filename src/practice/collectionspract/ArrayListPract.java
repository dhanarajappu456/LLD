package practice.collectionspract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListPract {

    public static void main(String[] args) {



        List<Integer >li = new ArrayList<Integer>();
        li.add(89);
        li.add(90);
        li.add(92);



        System.out.println("before  adding: " + li);
        List<Integer >li2  = new ArrayList<Integer>();

        li2.add(101);
        li2.add(102);
        // add all l2 items to l1 at the specified index of l1
        //if index not specified, then append at the end of the linked list
        li.addAll(1,li2);
        System.out.println("after adding" +  li);


        // add the specified item at the index
        li.add(0, 200000);
        System.out.println("inserted the 900 at 0th index" +  li);


        // remove the element by index
        li.remove(20);
        System.out.println("remove element at the idx 2 " +  li);

        // remove the element by object
        li.remove(Integer.valueOf(90));
        System.out.println("removed the specified element 90  " +  li);

        // replace the element at the index specified
        li.set(1,10000);
        System.out.println("replacing the 1 the index element to as 100000 " +  li);

        //get the element by index


        System.out.println("value at the 0th index  " +  li.get(0));





        // size of the list
        System.out.println("size of the li" +li.size());

        // checks if an element is in the list
        System.out.println("size of the li " + li.contains(90)) ;

        //searching for the first index of the given element


        // checking index  of occurrence , if element not present then return -1
        //first index of 900000
        System.out.println("first occurrence of 9000000 " + li.indexOf(9000000)) ;
        // last index of 92
        System.out.println("size of the li " + li.lastIndexOf(92)) ;

        //checks if the list is empty
        System.out.println("is list empty? " + li.isEmpty()) ;



        //sorting the list
        //1st way:
        li.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


        System.out.println("sorted list list 1:" +  li) ;
        //2nd way - specifically for list
        Collections.sort(li2);
        System.out.println("sorted list list2  :" +  li2) ;


        //looping

        System.out.println(" loop \n") ;

        //1- for loop


        for (int j = 0; j < li.size(); j++) {

            // Using get() method to
            // access particular element
            System.out.print(li.get(j) + " ");
        }

        // New line for better readability
        System.out.println();

        //2- Using for-each loop for iteration
        //2 - using advanced for loop
        for (Integer val : li)

            // Printing all the elements
            // which was inside object
            System.out.print(val + " ");

        // arraylist  to the array
        //parameter toArray represent the empty array which is the type of array to be made ,
        Integer[] arr = li.toArray(new Integer[0]);

        //clear all the elements in the arraylist
        li.clear();
        System.out.println("list after  removing the elements"+ li);
























    }
}
