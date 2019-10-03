package com.daa.impl;

import com.daa.model.Node;

public class Queue {
	
	private Node front=null;
	private Node node;
	
	public void enqueue(int value) {
		node=front;
		if(node==null) {
			node=new Node();
			node.setValue(value);
			node.setNext(null);
			front=node;
			return;
		}
		
		Node newNode=new Node();
		
		newNode.setValue(value);
		newNode.setNext(node);
		front=newNode;
	}
	
	public void dequeue() {
		node=front;
		if(node==null) {
			System.out.println("QUEUE IS EMPTY");
			return;
		}
		
		while(node.getNext()!=null) {
			if(node.getNext().getNext()==null) 
				break;
			
			node=node.getNext();
		}
		
		node.setNext(null);
		
	}
	
	public void printQueue() {
		node=front;
		if(node==null) {
			System.out.println("INSERT ELEENTS TO PRINT QUEUE");
		}
		System.out.print("\nELEMENTS IN QUEUE:");
		while(node.getNext()!=null) {
			System.out.print(node.getValue()+"->");
			node=node.getNext();
		}
		System.out.print(node.getValue());
	}

}
