package com.housing;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {
	
		Node root = new Node(0, null) ;
		LinkedList ll = this.createLinkedList(root, 10);
		System.out.println(ll);
		LinkedListUtil.reverse(ll);
		System.out.println(ll);
		assertEquals(9, ll.getRoot().getData());
	}

	private LinkedList createLinkedList(Node root, int size) {
		LinkedList ll = new LinkedList(root);
		Node tmp = root ;
		for(int i = 1; i< size; i++) {
			Node n = new Node(i, null) ;
			tmp.setNext(n) ;
			tmp = n ;
		}
		return ll ;
	}
	
}
