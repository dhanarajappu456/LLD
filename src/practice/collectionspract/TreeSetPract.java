package practice.collectionspract;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.*;

public class TreeSetPract {
    public static void main(String[] args) {


        TreeSet<Integer> set1 = new TreeSet<Integer>();

        set1.headSet(90);
        // O(1) average and worst-case (assuming good hash function and no rehashing)

        set1.add(90);
        set1.add(92);
        set1.add(89);
        //headset  -get the set from the specified, with all elements  strictly less than the value provided
        //
        System.out.println("the headset is : " +  set1.headSet(90));

        //tailSet - get the set from the specified, with all elements  strictly >  than the value provided
        System.out.println("the tail is : " +  set1.headSet(91));








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

        set1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        set2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6));

        set1.retainAll(set2);

        System.out.println(set1);  // Prints [3, 4]
        set1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        set2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6));

        set1.addAll(set2);

        System.out.println(set1);  // Prints [1, 2, 3, 4, 5, 6]
        set1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4));
        set2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6));

        set1.removeAll(set2);
        System.out.println(set1);  // Prints [1, 2]

        //additional method for only sortedSet


        //1)getting first and last elements

        Integer first = set1.first();
        System.out.println(first);

        Integer last =  set1.last();
      
        System.out.println(last);



        //method alone to treeset




        //1) getting the descendingiterator  - remember this method is defined inside treeset , so we need convert the type

        TreeSet treeset  = (TreeSet)set1;

        Iterator<Integer> it = treeset.descendingIterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }
        //2 getting descending set

        System.out.println("descending set is : " + treeset.descendingSet());

        //getting floor and ceiling

        System.out.println("floor and ceil " +  treeset.floor(0) + " "+ treeset.ceiling(2)) ;


        //higher - returns  least element strictly  greater than the given element, if no such element then gives null


        //lower - gives the greatest element , strictly less than the given element, else null

        System.out.println("lower and higher" + treeset.lower(1) +  " " + treeset.higher(90)) ;
        //pollFirst,pollLast - removes and return the first and last element of the set , else return null

        Integer  polledFirst  =(Integer) treeset.pollFirst();

        System.out.println("polled = "+ polledFirst +  " set after polling = " + treeset ) ;

















    }
}
