package com.daa.impl;

import com.daa.model.*;

public class LinkedList {
	
	private Node head=null;  //for in-memory head/tail marker purpose
	
	
	private Node node;  // for operation purpose
	
	
	
	public void addNodeAtHead(int Value) {
		//setting node as head
		node=head;
		
		//if element is first element in list
		if(node==null) {
			node=new Node();
			node.setValue(Value);
			node.setNext(null);
			head=node;
			return;
		}
		
		// creating new node for traversing till last of the list
		Node newNode=new Node();
		newNode.setValue(Value);
		newNode.setNext(null);
		
		while(node.getNext()!=null) {
			node=node.getNext();
		}
		
		node.setNext(newNode);
		
		
	}
	
	public void addNodeAtTail(int value) {
		
		node=head;
		
		if(node==null) {
			node=new Node();
			node.setValue(value);
			node.setNext(null);
			head=node;
			return;
		}
		
		Node newNode=new Node();
		newNode.setValue(value);
		newNode.setNext(node);
		head=newNode;
		
	}
	
	
	
	//for printing the List
	public void printList() {
		
		//setting node as head
		node=head;
		
		System.out.print("HEAD: ");
		
		//traversing in list
		while(node.getNext()!=null) {
			
			System.out.print(node.getValue());
			node=node.getNext();
			
			System.out.print("->");
			
		}
		System.out.print(node.getValue());
		System.out.println();
	}

}
