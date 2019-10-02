package com.daa.impl;

import com.daa.model.Node;

public class Stack {
	
	private Node top=null;
	private Node node;
	int size=0;
	
	public void push(int value) {
		node=top;
		if(node==null) {
			node=new Node();
			node.setValue(value);
			node.setNext(null);
			top=node;
			size++;
			return;
		}
		Node newNode=new Node();
		
		newNode.setValue(value);
		newNode.setNext(node);
		
		top=newNode;
		
	}
	
	public void pop() {
		node=top;
		if(size==0) {
			System.out.println("UNDERFLOW");
		}
		System.out.println();
		top=node.getNext();
	}
	
	public void printStack() {
		node=top;
		System.out.print("TOP: ");
		while(node.getNext()!=null) {
			System.out.print(node.getValue()+"->");
			node=node.getNext();
		}
		System.out.print(node.getValue());
	}

}
