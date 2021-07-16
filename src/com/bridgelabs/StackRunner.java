/****************************************************************
 * Purpose : To remove elements from queue.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class StackRunner {

	public static void main(String[] args) {
		StackAndQueueOperation<Integer> performOperation = new StackAndQueueOperation<Integer>();
		System.out.println("============STACK================");
		// Adding elements to stack.
		performOperation.addElement(70);
		performOperation.addElement(30);
		performOperation.addElement(56);
		// Displaying all the elements in stack.
		performOperation.show();
		// To perform pop operation to remove last element.
		System.out.println(performOperation.removeElement());
		// To perform peek operation to show last element.
		System.out.println(performOperation.peekElements());

		System.out.println("============QUEUE================");

		// Adding elements to queue.
		performOperation.addElementsToQueue(56);
		performOperation.addElementsToQueue(30);
		performOperation.addElementsToQueue(70);

		// Displaying all the elements in queue.
		performOperation.displayQueue();

		// Removing element from queue.
		System.out.println("Element removed is: " + performOperation.removeElementsFromQueue());

	}

}
