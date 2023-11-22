package practice.collectionspract;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


/*
* The Queue interface provides several methods for adding, removing, and inspecting elements in the queue. Here are some of the most commonly used methods:

add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.

offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.

remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.

poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.

element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.

peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
*
* */
public class PriorityQueuPract {

    public static void main(String[] args) {

            // by default the  priority queue is minheap, to create the max heap ,  use the comparator

                PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

                // add (or enqueue) - Inserts element to the priority queue.
                // Time complexity: O(log n)
                priorityQueue.add(89);
                priorityQueue.add(90);
                priorityQueue.add(92);
                System.out.println("before adding: " + priorityQueue);

                // addAll - Adding multiple elements.
                // Time complexity: O(n log n)
                priorityQueue.addAll(Arrays.asList(101, 102));
                System.out.println("after adding: " + priorityQueue);

                // remove (or dequeue) - Removes the head.
                // Time complexity: O(log n)
                priorityQueue.remove();
                System.out.println("remove element (head): " + priorityQueue);

                // remove by object value
                // Time complexity: O(n)
                priorityQueue.remove(Integer.valueOf(90));
                System.out.println("removed the specified element 90: " + priorityQueue);

                // peek - Get the head without removing
                // Time complexity: O(1)
                System.out.println("value at the head: " + priorityQueue.peek());

                // size
                // Time complexity: O(1)
                System.out.println("size of the queue: " + priorityQueue.size());

                // contains - check if the queue contains an element
                // Time complexity: O(n)
                System.out.println("does queue contain 90?: " + priorityQueue.contains(90));

                // isEmpty
                // Time complexity: O(1)
                System.out.println("is queue empty? " + priorityQueue.isEmpty());

                // looping
                System.out.println("loop \n");
                // Using the forEach method (internally uses an iterator)
                // Time complexity: O(n)
        //you can also use the iterator()  use the iterator to iterate
                for (Integer val : priorityQueue) {
                    System.out.print(val + " ");
                }
                System.out.println();

                // convert queue to array
                // Time complexity: O(n)
                Integer[] arr = priorityQueue.toArray(new Integer[0]);

                // clear
                // Time complexity: O(1)
                priorityQueue.clear();
                System.out.println("queue after removing elements: " + priorityQueue);

                // additional methods exclusive to priority queue:
                priorityQueue.offer(89);  // Adds an element and returns true if successful. O(log n)
                priorityQueue.poll();     // Retrieves and removes the head, or returns null if empty. O(log n)

                //creating the max heap


                PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());

                maxPQ.add(89);
                maxPQ.add(90);
                maxPQ.add(92);

                System.out.println(maxPQ.poll());  // Expected output: 92 (since it's the largest value)
                System.out.println(maxPQ.poll());  // Expected output: 90
                System.out.println(maxPQ.poll());  // Expected output: 89





            }


}
