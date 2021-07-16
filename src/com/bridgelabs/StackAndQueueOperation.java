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

	/* purpose: Method to display the elements in stack */
	public void show() {

		Collections.reverse(myStack);
		System.out.println(myStack);
	}

}
