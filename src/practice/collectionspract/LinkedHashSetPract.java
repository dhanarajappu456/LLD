package practice.collectionspract;

import java.util.*;

public class LinkedHashSetPract {

    public static void main(String[] args) {


        Set<Integer> set1 =new LinkedHashSet<Integer>();

        // O(1) average and worst-case (assuming good hash function and no rehashing)
        set1.add(89);
        set1.add(90);
        set1.add(92);

        System.out.println("Before adding: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(102);
        set2.add(101);

        // O(n) where n is the number of elements in set2
        set1.addAll(set2);
        System.out.println("After adding: " + set1);

        // O(1) average and worst-case (assuming good hash function)
        set1.remove(90);
        System.out.println("After removing 90: " + set1);

        // O(1)
        System.out.println("Size of the set1: " + set1.size());

        // O(1) average and worst-case (assuming good hash function)
        System.out.println("Is 90 in the set1? " + set1.contains(90));

        // O(1)
        System.out.println("Is set1 empty? " + set1.isEmpty());


        //remember there is not sort method ,unlike the list types
        // O(n log n) for the TreeSet to sort the elements
        Set<Integer> sortedSet = new TreeSet<>(set1);
        System.out.println("Sorted set1: " + sortedSet);




        // O(n) for iterating over the entire set
        System.out.println("Loop using iterator:");
        Iterator<Integer> iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // O(n) for iterating over the entire set
        System.out.println("Loop using for-each:");
        for (Integer val : set1) {
            System.out.print(val + " ");
        }
        System.out.println();


        // set to the array
        //parameter toArray represent the empty array which is the type of array to be made ,
        Integer[] arr = set1.toArray(new Integer[0]);

        System.out.println("array from the set: " + Arrays.toString(arr));

        // O(n) for clearing the entire set
        set1.clear();

        System.out.println("Set after clearing: " + set1);


    }
}
