package com.daa.impl;

import com.daa.model.TreeNode;

public class BinarySearchTree {
	
	private TreeNode root;
	
	private TreeNode node;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insertNode(int value) {
		
		node=root;
		
		if(node==null) {
			node=new TreeNode();
			node.setValue(value);
			root=node;
			return;
		}
		
		root=insert(node,value);
		
	}
	
	public TreeNode insert(TreeNode root,int value) {
		
		if(root==null) {
			root=new TreeNode();
			root.setValue(value);
			return root;
		}
		
		else if(root.getValue()<=value) {
			root.setRight(insert(root.getRight(),value));
			
		}
		else if(root.getValue()>value) {
			root.setLeft(insert(root.getLeft(),value));
			
		}
		
		return root;
	}
	
	public static void print(TreeNode root) {
		
		if(root==null)
			return;
		
		print(root.getLeft());
		
		System.out.print(" "+root.getValue()+" ");
		
		print(root.getRight());
		
	}
	
	public void printTree() {
		
		node=root;
		
		print(root);
	}

}
