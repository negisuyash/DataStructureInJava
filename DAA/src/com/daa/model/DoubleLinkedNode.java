package com.daa.model;

public class DoubleLinkedNode {
	
	private DoubleLinkedNode prev;
	private DoubleLinkedNode next;
	private int value;
	public DoubleLinkedNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleLinkedNode prev) {
		this.prev = prev;
	}
	public DoubleLinkedNode getNext() {
		return next;
	}
	public void setNext(DoubleLinkedNode next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	
	

}
