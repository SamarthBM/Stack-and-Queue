/****************************************************************
 * Purpose : To push elements to stack.
 * 70 will be added first,
 * 30 and 56 is later pushed to get 56 on top.
 * Final sequence: 56->30->70
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
		

	}

}

