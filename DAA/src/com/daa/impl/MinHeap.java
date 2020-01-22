package com.daa.impl;

public class MinHeap {
	
	private int[] heap;
	private int size,maxsize;
	
	private static final int FRONT=1;
	
	public MinHeap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		heap=new int[this.maxsize+1];
		heap[0]=Integer.MIN_VALUE;
	}
	
	private int parent(int pos) {
		return pos/2;
	}
	
	private int leftChild(int pos) {
		return pos*2;
	}
	
	private int rightChild(int pos) {
		return pos*2+1;
	}
	
	private boolean isLeaf(int pos) {
		if(pos >= size/2 && pos<=size ) {
			return true;
		}
		return false;
	}
	
	private void swap(int fpos,int spos) {
		int temp;
		temp=heap[fpos];
		heap[fpos]=heap[spos];
		heap[spos]=temp;
	}
	
	private void minHeapify(int pos) {
		if(!isLeaf(pos)) {
			if(heap[pos]>heap[leftChild(pos)] || heap[pos]>heap[rightChild(pos)]) {
				if(heap[pos]>heap[leftChild(pos)]) {
					swap(pos,leftChild(pos));
					minHeapify(leftChild(pos));
				}
				else {
					swap(pos,rightChild(pos));
					minHeapify(rightChild(pos));
				}
			}
		}
	}
	
	public void insert(int element) {
		
		if(size>=maxsize) {
			return;
		}
		
		heap[++size]=element;
		int current=size;
		
		while(heap[current] < heap[parent(current)]) {
			swap(current,parent(current));
			current=parent(current);
		}
		
	}
	
	public void print() {
		for(int i=1;i<=size/2;i++) {
			
			System.out.println( " PARENT :"+heap[i]+ " LEFT CHILD :"+heap[leftChild(i)]+ " RIGHT CHILD :"+heap[rightChild(i)]);
			
		}
	}
	
	public void minHeap() {
		for(int pos=size/2;pos>=1;pos--) {
			minHeapify(pos);
		}
	}
	
	public int remove() {
		int popped=heap[FRONT];
		heap[FRONT]=heap[size--];
		minHeapify(FRONT);
		return popped;
	}
	
	public static void main(String[] a) {
		System.out.println("The Min Heap is "); 
        MinHeap minHeap = new MinHeap(15); 
        minHeap.insert(5); 
        minHeap.insert(3); 
        minHeap.insert(17); 
        minHeap.insert(10); 
        minHeap.insert(84); 
        minHeap.insert(19); 
        minHeap.insert(6); 
        minHeap.insert(22); 
        minHeap.insert(9); 
        minHeap.minHeap(); 
  
        minHeap.print(); 
        System.out.println("The Min val is " + minHeap.remove()); 
	}
	
	

}
