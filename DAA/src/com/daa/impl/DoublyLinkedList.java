package com.daa.impl;

import com.daa.model.DoubleLinkedNode;

public class DoublyLinkedList {
	
	private DoubleLinkedNode head=null;
	private DoubleLinkedNode node;
	
	public void addNodeAtHead(int value) {
		
		node=head;
		if(node==null) {
			node=new DoubleLinkedNode();
			node.setValue(value);
			node.setNext(null);
			node.setPrev(null);
			head=node;
			return;
		}
		DoubleLinkedNode newNode=new DoubleLinkedNode();
		
		while(node.getNext()!=null) {
			node=node.getNext();
		}
		
		newNode.setValue(value);
		newNode.setNext(null);
		newNode.setPrev(node);
		
		
		node.setNext(newNode);
	}
	
	public void addNodeAtTail(int value) {
		node=head;
		if(node==null) {
			node=new DoubleLinkedNode();
			node.setValue(value);
			node.setNext(null);
			node.setPrev(null);
			head=node;
			return;
		}
		DoubleLinkedNode newNode=new DoubleLinkedNode();
		
		newNode.setValue(value);
		newNode.setNext(node);
		newNode.setPrev(null);
		
		//adding prev for head of DoublyList
		node.setPrev(newNode);
		
		//settting new head of DoublyList
		head=newNode;
		
	}
	
	// for printing of DoublyList
	public void printDoublyList() {
		System.out.print("IN ORDER:\n");
		node=head;
		while(node.getNext()!=null) {
			System.out.print(node.getValue()+"<->");
			node=node.getNext();
		}
		System.out.print(node.getValue());  //printing last element
		
		//  ------> NOW NODE IS AT LAST ELEMENT OF THE DOUBLYLINKEDLIST <------ 
		
		System.out.println("\nIN REVERSE ORDER:");
		while(node.getPrev()!=null) {
			System.out.print(node.getValue()+"<->");
			node=node.getPrev();
		}
		System.out.print(node.getValue());   //printing first element
		
	}
	

}
