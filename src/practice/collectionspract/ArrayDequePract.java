package practice.collectionspract;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequePract {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to the tail (equivalent to Queue's offer())
        // O(1) average time complexity, might be O(n) when resizing
        deque.add(1);
        deque.add(2);
        deque.add(3);

        // Add elements to the head
        // O(1) average time complexity, might be O(n) when resizing
        deque.addFirst(0);

        // Add elements to the tail
        // O(1) average time complexity, might be O(n) when resizing
        deque.addLast(4);

        System.out.println("Deque after additions: " + deque);

        // Remove elements from the head
        // O(1)
        deque.removeFirst();

        // Remove elements from the tail
        // O(1)
        deque.removeLast();

        System.out.println("Deque after removals: " + deque);

        // Peek (inspect) elements at the head without removal
        // O(1)
        System.out.println("First element: " + deque.peekFirst());

        // Peek (inspect) elements at the tail without removal
        // O(1)
        System.out.println("Last element: " + deque.peekLast());

        // Check if the deque contains an element
        // O(n) since it has to traverse the deque
        System.out.println("Contains 2? " + deque.contains(2));

        // Size of the deque
        // O(1)
        System.out.println("Size: " + deque.size());

        // Convert the deque to an array
        // O(n)
        Object[] array = deque.toArray();

        // Clear the deque
        // O(n)
        deque.clear();

        System.out.println("Deque after clearing: " + deque);
        // it also support other method in the queue and list
    }

    }

