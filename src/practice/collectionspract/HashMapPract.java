package practice.collectionspract;

import java.util.HashMap;
import java.util.Iterator;
import  java.util.Arrays;

public class HashMapPract {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();

        // O(1) average and worst-case (assuming good hash function and no rehashing)
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");
        System.out.println("Initial map: " + map1);

        // O(1) average and worst-case (assuming good hash function)
        map1.put(3, "Chuck");
        System.out.println("After updating: " + map1);

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "David");
        map2.put(5, "Eve");

        // O(n) where n is the number of entries in map2
        map1.putAll(map2);
        System.out.println("After adding map2: " + map1);

        // O(1) average and worst-case (assuming good hash function)
        map1.remove(2);
        System.out.println("After removing key 2: " + map1);
        //get the item by key

        System.out.println("Keys from the map: " + map1.get(589589));  // return null if the element not present
        // O(1)
        System.out.println("Size of map1: " + map1.size());

        // O(1) average and worst-case (assuming good hash function)
        System.out.println("Does map contain key 2? " + map1.containsKey(2));

        // O(1) average and worst-case (assuming good hash function)
        System.out.println("Does map contain value 'Eve'? " + map1.containsValue("Eve"));

        // O(1)
        System.out.println("Is map1 empty? " + map1.isEmpty());

        // O(n) for iterating over the entire map
        System.out.println("Loop using iterator:");
        Iterator<Integer> iterator = map1.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }
        // remember to iterate you need to convert the map in to set
        // O(n) for iterating over the entire map
        System.out.println("Loop using for-each:");
        for (Integer key : map1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }

        // some methods specific to the hash map




        //1keyset

        //return the set of keys   in the map is

        System.out.println("the  key   in the map is : " + map1.keySet());

        //2)values

        //return collection of the values

        System.out.println("the values in the map is : " + map1.values());


        //3entry set

        //return the set of items in the map

        System.out.println("the items  in the map is : " + map1.entrySet());
        //getorDefault

        //get the value of the key or else the default value

        System.out.println("using the getordefault : "  + map1.getOrDefault("895345","defstring"));

        //putIfAbsent  - > put the item if key is not already in the map / it is associated with null --> it returns null value afte insertion
        //in case the key is already associated with some non null values, then it don't overwrite this item, also it return the existing value for the key
        // Map to arrays



                HashMap<String, Integer> map = new HashMap<>();
                map.put("Alice", 25);
                System.out.println("Initial map: " + map);

                // Try to add a new value for "Alice". Since "Alice" is already in the map, this won't change anything.

                Integer returnedValue1 = map.putIfAbsent("Alice", 30);

                System.out.println("After attempting to put 30 for Alice: " + map);
                System.out.println(returnedValue1);  // Outputs: 25

                // Try to add a value for "Bob". Since "Bob" isn't in the map, this will add him.

                Integer returnedValue2 = map.putIfAbsent("Bob", 30);

                System.out.println("After putting 30 for Bob: " + map);

                System.out.println(returnedValue2);  // Outputs: null




        Integer[] keys = map1.keySet().toArray(new Integer[0]);
        System.out.println("Keys from the map: " + Arrays.toString(keys));


        // O(n) for clearing the entire map
        map1.clear();
        System.out.println("Map after clearing: " + map1);







    }
}
