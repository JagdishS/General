package com.housing;

public class LinkedListUtil {
	
	private static Node newRoot = null ;
	
	public static void reverse(LinkedList list) {
	
		Node root = list.getRoot() ;
		
		reverse(root) ;
		list.setRoot(newRoot);
	}
	
	private static void reverse(Node node) {

		if (node.getNext().getNext() != null) {
			reverse(node.getNext());
		}
		node.getNext().setNext(node);
		if (newRoot == null) {
			newRoot = node.getNext();
		}
		node.setNext(null);

	}

}