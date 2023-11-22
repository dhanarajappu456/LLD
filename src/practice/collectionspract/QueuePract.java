package practice.collectionspract;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePract {


    public static void main(String[] args) {/*
* The Queue interface provides several methods for adding, removing, and inspecting elements in the queue. Here are some of the most commonly used methods:

add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.

offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.

remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.

poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.

element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.

peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
*
* */


        Queue<Integer> queue = new LinkedList<>();

        // add (or enqueue)
        // Time complexity: O(1)
        queue.add(89);
        queue.add(90);
        queue.add(92);

        System.out.println("before adding: " + queue);

        // addAll - Adding multiple elements.
        // Time complexity: O(n) where n is the number of elements to be added
        queue.addAll(java.util.Arrays.asList(101, 102));
        System.out.println("after adding: " + queue);

        // No direct method in a queue to add at a specific index as it violates the FIFO nature of a Queue. - ie, add(index, val) method not work in queue


        // remove (or dequeue) - Removes the head.
        // Time complexity: O(1)
        queue.remove();
        System.out.println("remove element (head): " + queue);

        // remove by object value
        // Time complexity: O(n) in the worst case as it has to traverse to find the object
        queue.remove(Integer.valueOf(90));
        System.out.println("removed the specified element 90: " + queue);

        // No direct method to replace an element at a specific index in a queue as it violates its nature.

        // peek - Get the head without removing
        // Time complexity: O(1)
        System.out.println("value at the head: " + queue.peek());

        // size
        // Time complexity: O(1)
        System.out.println("size of the queue: " + queue.size());

        // contains - check if the queue contains an element
        // Time complexity: O(n) in the worst case as it has to traverse to find the object
        System.out.println("does queue contain 90?: " + queue.contains(90));

        // No direct methods in a queue for indexOf or lastIndexOf as it violates the FIFO nature of a Queue.

        // isEmpty
        // Time complexity: O(1)
        System.out.println("is queue empty? " + queue.isEmpty());

        // sorting - Using a PriorityQueue to sort. This is not a common operation on a queue, so we use a workaround.
        // Time complexity: O(n log n)
        Queue<Integer> sortedQueue = new PriorityQueue<>(queue);
        System.out.println("sorted queue: " + sortedQueue);

        // looping

        System.out.println("loop \n");

        // Using the forEach method (internally uses an iterator)
        // Time complexity: O(n)
        for (Integer val : queue) {
            System.out.print(val + " ");
        }
        System.out.println();

        // convert queue to array
        // Time complexity: O(n)
        Integer[] arr = queue.toArray(new Integer[0]);

        // clear
        // Time complexity: O(n)
        queue.clear();
        System.out.println("queue after removing elements: " + queue);




        queue = new LinkedList<>();
        queue.add(89);
        queue.add(90);
        queue.add(92);
        //additional method exclusive to queue






        System.out.println("retrieve  first element: " + queue.peek());
        System.out.println("retrieve  first element: " + queue.element());
        System.out.println("adding the  element at the end : " + queue.add(10000));   // error if unsuccessful , insertion ,like reaching max cpacity
        System.out.println("adding the  element at the end s: " + queue.offer(1039094)); // enull if
        System.out.println(" retrieve and remove the first element : " + queue.poll()); // null if empty
        System.out.println(" retrieve and remove the first element :  " + queue.remove()); // no such element exception , if empty










    }
}
