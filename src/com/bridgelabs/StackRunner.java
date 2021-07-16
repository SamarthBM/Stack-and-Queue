/****************************************************************
 * Purpose : To pop and peek in stack.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class StackRunner {

	public static void main(String[] args) {
		StackAndQueueOperation<Integer> performOperation = new StackAndQueueOperation<Integer>();
		// Adding elements to stack.
		performOperation.addElement(70);
		performOperation.addElement(30);
		performOperation.addElement(56);
		//Displaying all the elements in stack.
		performOperation.show();
		//To perform pop operation to remove last element.
		System.out.println(performOperation.removeElement());
		//To perform peek operation to show last element.
		System.out.println(performOperation.peekElements());
		

	}

}

