package com.daa.model;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private int value;
	public TreeNode() {
		this.left=null;
		this.right=null;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	

}
