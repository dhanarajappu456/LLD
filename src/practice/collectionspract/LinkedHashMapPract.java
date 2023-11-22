package practice.collectionspract;

//maintains the  insertion order , unlike the hashmap

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapPract {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // O(1) average and worst-case (assuming good hash function and no rehashing)
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");
        System.out.println("Initial map: " + map1);

        // O(1) average and worst-case (assuming good hash function)
        map1.put(3, "Chuck");
        System.out.println("After updating: " + map1);

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(4, "David");
        map2.put(5, "Eve");

        // O(n) where n is the number of entries in map2
        map1.putAll(map2);
        System.out.println("After adding map2: " + map1);

        // O(1) average and worst-case (assuming good hash function)
        map1.remove(2);
        System.out.println("After removing key 2: " + map1);

        // O(1) average and worst-case (assuming good hash function)
        System.out.println("Key 589589 from the map: " + map1.get(589589));  // return null if the element not present

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

        // O(n) for iterating over the entire map
        System.out.println("Loop using for-each:");
        for (Integer key : map1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }

        // O(1)
        System.out.println("Keys in the map: " + map1.keySet());

        // O(1)
        System.out.println("Values in the map: " + map1.values());

        // O(1)
        System.out.println("Entries in the map: " + map1.entrySet());

        // O(1) average and worst-case (assuming good hash function)
        System.out.println("Using getOrDefault: " + map1.getOrDefault(895345, "defstring"));

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Alice", 25);
        System.out.println("Initial map: " + map);

        Integer returnedValue1 = map.putIfAbsent("Alice", 30);

        System.out.println("After attempting to put 30 for Alice: " + map);
        System.out.println(returnedValue1);  // Outputs: 25

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
