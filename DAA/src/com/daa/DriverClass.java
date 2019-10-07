package com.daa;

import com.daa.impl.CircularQueue;
import com.daa.impl.DoublyLinkedList;
import com.daa.impl.LinkedList;
import com.daa.impl.Queue;
import com.daa.impl.Stack;
import com.daa.problems.TowerOfHanoi;

public class DriverClass {
	
	public static void main(String args[]) {
		
		/* //UNCOMMENT FOR LINKED LIST
		 		
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
		
		*/
		
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
		
		stack.peek();
		
		//printing stack
		stack.printStack();
		
		//removing data from stack
		stack.pop();
		stack.pop();
		
		stack.peek();
		//printing stack
		stack.printStack();
		
		*/
		
		
		/*
			//UNCOMMENT FOR QUEUE
		
		Queue queue=new Queue();
		
		//adding data in queue
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(77);
		queue.enqueue(23);
		queue.enqueue(144);
		
		//printing queue
		queue.printQueue();
		
		//removing data from queue
		queue.dequeue();
		queue.dequeue();
		
		//printing data from queue
		queue.printQueue();
		
		*/
		
		/*	//UNCOMMENT FOR CIRCULAR QUEUE
		
		CircularQueue circularQueue=new CircularQueue();
		
		//adding data to circular queue
		circularQueue.enqueue(300);
		circularQueue.enqueue(22);
		circularQueue.enqueue(56);
		circularQueue.enqueue(67);
		circularQueue.enqueue(234);
		circularQueue.enqueue(41);
		circularQueue.enqueue(66);
		
		//printing data of circular queue
		circularQueue.printCircularQueue();
		
		//removing data from circular queue
		circularQueue.dequeue();
		circularQueue.dequeue();
		circularQueue.dequeue();
		
		//printing data from new circular queue
		circularQueue.printCircularQueue();
	}
	
	*/
		
	  //UNCOMMENT FOR TOWER OF HANOI PROBLEM
	  
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
		
		//CREATING SOLUTION FOR TOWER OF HANOI PROBLEM WITH 4 DISK
		towerOfHanoi.hanoi(3, 'A', 'B', 'C');   //  4--> number of disk, A--> source, B--> via,C--> destination
	 	
	 
	 
	 
	  
	 
	}
}
