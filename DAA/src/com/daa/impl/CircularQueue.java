package com.daa.impl;

import com.daa.model.Node;

public class CircularQueue {
	
	private Node front=null;
	private Node back=null;
	private Node node;
	
	public void enqueue(int value) {
		node=front;
		if(node==null) {
			node=new Node();
			node.setValue(value);
			node.setNext(node);
			front=back=node;
			return;
		}
		Node newNode=new Node();
		
		newNode.setValue(value);
		newNode.setNext(node);
		
		front=newNode;
		back.setNext(newNode);
		
	}
	
	public void dequeue() {
		node=front;
		//if circular queue is empty
		if(node==null) {
			System.out.println("NO ELEMENT IN CIRCULAR QUEUE TO BE DEQUEUED");
			return;
		}
		
		
		if(front==back) {
			front=null;
			back=null;
		}
		
		//traversing to second last element of circular queue
		while(node.getNext()!=front) {
			if(node.getNext().getNext()==front)
				break;
			node=node.getNext();
		}
		
		back=node;
		node.setNext(front);
		
		
	}
	
	public void printCircularQueue() {
		node=front;
		if(node==null) {
			System.out.println("NO ELEMENT IN CIRCULAR QUEUE TO PRINT");
		}
		System.out.print("\n ELEMENTS OF CIRCULAR QUEUE: ");
		while(node.getNext()!=front) {
			System.out.print(node.getValue()+"->");
			node=node.getNext();
		}
		System.out.print(node.getValue());
	}
	

}
