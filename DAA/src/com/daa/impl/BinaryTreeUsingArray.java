package com.daa.impl;

public class BinaryTreeUsingArray {
	
	private int load;
	private int[] tree;
	private int counter;
	
	public BinaryTreeUsingArray(int load){
		this.load=load;
		this.counter=0;
		this.tree=new int[load];
		for(int i=0;i<this.load;i++) {
			this.tree[i]=-1;
		}
	}
	
	public void insertNode(int value) {
		
		if(2*(counter+1)>load) {
			System.out.println("ARRAY OUT OF CAPACITY");
			return;
		}
		
		if(tree[counter]==-1) {
			tree[counter]=value;
			
			
		}
		else if(tree[(2*counter+1)]==-1) {
			tree[(2*counter+1)]=value;
		}
		else if(tree[2*counter+2]==-1) {
			tree[2*counter+2]=value;
			
		}
		else {
			
		}
		
		for(int i=0;i<counter;i++) {
			System.out.println("Array["+i+"] : "+tree[i]);
		}
		
		
	}
	
	public void printTree() {
		if(counter==0) {
			System.out.println("EMPTY TREE");
			return;
		}
		for(int i=0;i<counter;i++) {
			System.out.println(tree[i]+" HAS LEFT CHILD "+tree[2*(counter+1)-1]+" AND RIGHT CHILD "+tree[2*(counter+1)]);
		}
	}

}


