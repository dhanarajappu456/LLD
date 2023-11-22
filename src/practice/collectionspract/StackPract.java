package practice.collectionspract;

import java.util.Comparator;
import java.util.Stack;

public class StackPract {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(89);
        stack.push(90);
        stack.push(92);

        System.out.println("Before adding: " + stack);
        //stk popping
        System.out.println("popped:" + stack.pop());
        //getting top element of stack
        System.out.println("top element ,using peek " + stack.peek());
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(101);
        stack2.push(102);


        // Add all stack2 items to stack (append at the end) O(1)
        stack.addAll(stack2);
        System.out.println("After adding: " + stack);

        // Insert at a specific index O(n)
        //
        stack.add( 0,20000);
        System.out.println("Inserted 200000 at 0th index: " + stack);

        // Remove the element by index O(n)
        stack.remove(2);
        System.out.println("Removed element at idx 2: " + stack);

        // Remove the element by object O(n)
        stack.remove(Integer.valueOf(90));
        System.out.println("Removed the specified element 90: " + stack);

        // Replace the element at the specified index O(1)
        stack.set(1, 10000);
        System.out.println("Replaced the 1st index element to 10000: " + stack);

        // Get the element by index O(1)
        System.out.println("Value at the 0th index: " + stack.get(0));

        // Size of the stack O(1)
        System.out.println("Size of the stack: " + stack.size());

        // Check if an element is in the stack O(n)
        System.out.println("Is 90 in the stack? " + stack.contains(90));


        // First index of occurrence, returns -1 if not found O(n)
        System.out.println("First occurrence of 9000000: " + stack.indexOf(9000000));

        // Last index of 92 O(n)
        System.out.println("Last index of 92: " + stack.lastIndexOf(92));

        // Check if the stack is empty O(1)
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Sorting the stack O(n log n)
        stack.sort(Comparator.naturalOrder());
        System.out.println("Sorted stack: " + stack);

        System.out.println("Loop through the stack:");

        // Using for loop
        for (int j = 0; j < stack.size(); j++) {
            System.out.print(stack.get(j) + " ");
        }
        System.out.println();

        // Using for-each loop
        for (Integer val : stack) {
            System.out.print(val + " ");
        }
        // set to the array
        //parameter toArray represent the empty array which is the type of array to be made ,
        Integer[] arr = stack.toArray(new Integer[0]);
        //clear all the elements in the stack
        stack.clear();
        System.out.println("stack after  removing the elements"+ stack);


    }
}
