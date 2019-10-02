package com.daa;

import com.daa.impl.DoublyLinkedList;
import com.daa.impl.LinkedList;
import com.daa.impl.Stack;

public class DriverClass {
	
	public static void main(String args[]) {
		
		///* //UNCOMMENT FOR LINKED LIST
		 		
		 		//LINKED LIST DEMO
		
		LinkedList linkedList=new LinkedList();
		
		
		//adding some data in list at head and tail
		linkedList.addNodeAtHead((int)10);
		linkedList.addNodeAtHead(7);
		linkedList.addNodeAtHead(2);
		linkedList.addNodeAtTail(55);
		linkedList.addNodeAtTail(29);
		linkedList.addNodeAtTail(100);
		
		
		//printing list
		linkedList.printList();
		
		//*/
		
		/*//UNCOMMENT FOR DOUBLYLINKEDLIST
		  
		 		//DOUBLY LINKED LIST DEMO
		 
		
		DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
		
		//adding some data in DoublyList 
		doublyLinkedList.addNodeAtHead(100);
		doublyLinkedList.addNodeAtHead(8);
		doublyLinkedList.addNodeAtHead(13);
		doublyLinkedList.addNodeAtTail(15);
		doublyLinkedList.addNodeAtTail(55);
		doublyLinkedList.addNodeAtTail(24);
		
		//printing DoublyList
		doublyLinkedList.printDoublyList();
		
		*/
		
		
		/*     //UNCOMMENT FOR STACK
		  
		 			//STACK DEMO
		 
		
		Stack stack=new Stack();
		
		//adding data in stack
		stack.push(100);
		stack.push(40);
		stack.push(24);
		stack.push(42);
		
		//printing stack
		stack.printStack();
		
		//removing data from stack
		stack.pop();
		stack.pop();
		
		//printing stack
		stack.printStack();
		
		*/
	}

}