package practice.collectionspract;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import  java.util.Collections;
public class LinkedListPract {


    public static void main(String[] args) {



        LinkedList<Integer> li = new LinkedList<>();
        li.add(89);  // O(1)
        li.add(90);  // O(1)
        li.add(92);  // O(1)

        System.out.println("before adding: " + li);

        LinkedList<Integer> li2 = new LinkedList<>();
        li2.add(101);  // O(1)
        li2.add(102);  // O(1)

        li.addAll(1, li2);  // O(n) for LinkedList
        System.out.println("after adding: " + li);

        li.add(0, 200000);  // O(1)
        System.out.println("inserted 200000 at 0th index: " + li);

        li.remove(2);  // O(n) in worst-case
        System.out.println("removed element at idx 2: " + li);

        li.remove(Integer.valueOf(90));  // O(n) in worst-case
        System.out.println("removed the specified element 90: " + li);

        li.set(1, 10000);  // O(n) in worst-case
        System.out.println("replacing the 1st index element with 10000: " + li);

        System.out.println("value at the 0th index: " + li.get(0));  // O(n) in worst-case

        System.out.println("size of the li: " + li.size());  // O(1)

        System.out.println("contains 90?: " + li.contains(90));  // O(n)

        System.out.println("first occurrence of 9000000: " + li.indexOf(9000000));  // O(n)

        System.out.println("last occurrence of 92: " + li.lastIndexOf(92));  // O(n)

        System.out.println("is list empty?: " + li.isEmpty());  // O(1)

        li.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });  // O(n log n)
        System.out.println("sorted list li: " + li);

        Collections.sort(li2);  // O(n log n)
        System.out.println("sorted list li2: " + li2);

        // LinkedList-specific methods
        li.addFirst(500);  // O(1)
        System.out.println("added 500 at the beginning: " + li);

        li.addLast(600);  // O(1)
        System.out.println("added 600 at the end: " + li);

        li.removeFirst();  // O(1)
        System.out.println("removed the first element: " + li);

        li.removeLast();  // O(1)
        System.out.println("removed the last element: " + li);

        System.out.println("first element is: " + li.getFirst());  // O(1)

        System.out.println("last element is: " + li.getLast());  // O(1)

        // looping
        System.out.println("loop \n");

        for (int j = 0; j < li.size(); j++) {  // O(n) for the loop, and O(n) for get() in the worst-case. So, O(n^2) in total.
            System.out.print(li.get(j) + " ");
        }

        System.out.println();

        for (Integer val : li) {  // O(n)
            System.out.print(val + " ");
        }
        System.out.print("\n");

        // linked list   to the array
        //parameter toArray represent the empty array which is the type of array to be made ,
        Integer[] arr = li.toArray(new Integer[0]);

        //clear all the elements in the linkedlist
        //PEEKING THE FIRST ELEMENT
        System.out.println("peeking the element  "+ li.peek());

        li.clear();
        System.out.println("linked list  after  removing the elements"+ li);








    }
}




