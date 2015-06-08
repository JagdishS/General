package com.housing;

public class LinkedList {
	
	private Node root ;
	
	public LinkedList(Node root) {
		this.root = root ;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	@Override
	public String toString() {
		
		return root.toString();
	}

}
