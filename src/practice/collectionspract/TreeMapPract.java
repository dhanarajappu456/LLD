package practice.collectionspract;
//maintains the sorted oreder of the elements in the map

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPract {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // O(log n)
        treeMap.put(1, "Alice");
        treeMap.put(3, "Charlie");
        treeMap.put(2, "Bob");
        System.out.println("Initial map: " + treeMap);

        // O(log n)
        treeMap.put(3, "Chuck");
        System.out.println("After updating: " + treeMap);

        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(4, "David");
        treeMap2.put(5, "Eve");

        // O(n log n) where n is the number of entries in treeMap2
        treeMap.putAll(treeMap2);
        System.out.println("After adding treeMap2: " + treeMap);

        // O(log n)
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);

        // O(log n)
        System.out.println("Key 2 in the map: " + treeMap.get(2));

        // O(1)
        System.out.println("Size of treeMap: " + treeMap.size());

        // O(log n)
        System.out.println("Does map contain key 2? " + treeMap.containsKey(2));

        // O(n) in the worst case, as it might need to traverse all the entries
        System.out.println("Does map contain value 'Eve'? " + treeMap.containsValue("Eve"));

        // O(1)
        System.out.println("Is treeMap empty? " + treeMap.isEmpty());

        // O(log n) to get the first key
        System.out.println("First key in the map: " + treeMap.firstKey());

        // O(log n) to get the last key
        System.out.println("Last key in the map: " + treeMap.lastKey());

        // O(1)
        System.out.println("Keys in the map: " + treeMap.keySet());

        // O(1)
        System.out.println("Values in the map: " + treeMap.values());

        // O(1)
        System.out.println("Entries in the map: " + treeMap.entrySet());

        // O(log n) for both floor and ceiling operations
        System.out.println("Floor entry of 3: " + treeMap.floorEntry(3));
        System.out.println("Ceiling entry of 3: " + treeMap.ceilingEntry(3));

        // O(log n) for both lower and higher operations
        System.out.println("Lower key of 3: " + treeMap.lowerKey(3));

        System.out.println("Higher key of 3: " + treeMap.higherKey(3));

        // O(log n) for both poll operations

        System.out.println("Polled first entry: " + treeMap.pollFirstEntry());
        System.out.println("Polled last entry: " + treeMap.pollLastEntry());

        // O(n log n) for iterating over the entire map
        System.out.println("Loop using for-each:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // O(n) for clearing the entire map
        treeMap.clear();
        System.out.println("Map after clearing: " + treeMap);


    }
}
