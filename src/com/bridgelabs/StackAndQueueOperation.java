/****************************************************************
 * Purpose :To create methods to implement stack and queue.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.ArrayList;
import java.util.Collections;

public class StackAndQueueOperation<K> {
	K data;
	// Creating ArrayList to store elements in stack.
	ArrayList<K> myStack = new ArrayList<>();
	int count = 0;

	/*
	 * purpose: Method to add elements to stack
	 * 
	 * @param data: elements to be added.
	 */
	public void addElement(K data) {
		myStack.add(count, data);
		count++;
	}

	/* purpose: Method to remove elements from stack */
	public K removeElement() {
		K data;
		count--;
		data = myStack.get(count);
		myStack.remove(data);
		return data;
	}

	/* purpose: Method to show last element in stack */
	public K peekElements() {
		K data;
		data = myStack.get(count - 1);
		return data;
	}

	/* purpose: Method to display the elements in stack */
	public void show() {
		Collections.reverse(myStack);
		System.out.println(myStack);
	}
	
	/*Implementing methods for Queue*/
	
	int front;
	int rear;
	// Array list to store elements of queue
	ArrayList<K> myQueue = new ArrayList<>();
	
	/*
	 * purpose: Method to add elements to Queue.
	 * 
	 * @param data: elements to be added.
	 */
	public void addElementsToQueue(K data) {
		myQueue.add(rear, data);
		rear++;				
	}
	
	/* purpose: Method to display the elements in queue. */
	public void displayQueue() {
		System.out.println(myQueue);
	}
	
	


}
