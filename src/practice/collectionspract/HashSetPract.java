package practice.collectionspract;

import java.util.*;

//hashset don't guarantee the order of insertion
//for maintaining the order of insertion , use the linkedhashet
// for maintaining the sorted order, use treeset

// except treeset , enum set, other sets allow null objects

public class HashSetPract {

    public static void main(String[] args) {


        Set<Integer> set1 = new HashSet<>();

        // O(1) average and worst-case (assuming good hash function and no rehashing)
        set1.add(89);
        set1.add(90);
        set1.add(92);

        System.out.println("Before adding: " + set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(101);
        set2.add(102);

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


        //set operations like union , intersection , difference

      set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
         set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        set1.retainAll(set2);

        System.out.println(set1);  // Prints [3, 4]
        set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
         set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        set1.addAll(set2);

        System.out.println(set1);  // Prints [1, 2, 3, 4, 5, 6]
         set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        set1.removeAll(set2);

        System.out.println(set1);  // Prints [1, 2]




    }
}
