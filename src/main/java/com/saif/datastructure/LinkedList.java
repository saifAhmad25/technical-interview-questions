/**
 * 
 */
package com.saif.datastructure;

/**
 * WAP to create a Linked list
 * 
 * @author 49152
 *
 */
public class LinkedList {

	Node root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList nodeList = new LinkedList();
		nodeList.root = new Node(12, null);
		// Four nodes created
		Node secondNode = new Node(22, null);
		Node thirdNode = new Node(43, null);
		Node fourthNode = new Node(50, null);
		
		// Linked the first node with second and so on..
		nodeList.root.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;

		/* ======== Call method to traverse the Linked list data ===== */
		nodeList.traverseLinkedList();
		
		/* ======= Find the Nth node in Linked list ============= */
		int index = 2;
		int nthNode = nodeList.findNthNode(index);
		if (nthNode > 0) {
			System.out.println("Nth node data is exist in Linked List:" + nthNode);
		} else {
			System.out.println("Nth node data is not exist in Linked list");
		}
		
		/* ========= Insert a new node at the end of Linked list ==== */

		int intEndNode = nodeList.insertNodeLinkedListEnd();
		if (intEndNode > 0) {
			System.out.println("Inserted a new node at the end of Linked List  : " + intEndNode);
		}

		/* ======= Insert a new node at the start of Linked list ======= */

		int intStartNode = nodeList.insertNodeLinkedListStart();
		if (intStartNode > 0) {
			System.out.println("Inserted a new node at the start of Linked List  : " + intStartNode);
		}
		
		/* ======== Call method to traverse the Linked list data ===== */
		nodeList.traverseLinkedList();


	}

	/**
	 * This method is use to insert a node at the root/start of the Linked List
	 * @return
	 */
	private int insertNodeLinkedListStart() {
		Node current = root;
		if (current != null) {
			Node newHeadNode = new Node(7, null);
			newHeadNode.next = current;
			root = newHeadNode;
			return newHeadNode.nodeData;
		}
		return 0;
	}

	/**
	 * This method is use to insert at node at end of the Linked list
	 * 
	 */
	private int insertNodeLinkedListEnd() {
		Node current = root;
		while (current != null) {
			if (current.next == null) {
				Node newNode = new Node(6, null);
				current.next = newNode;
				return newNode.nodeData;
			} else {
				current = current.next;
			}

		}
		return 0;

	}

	/**
	 * This method is use to find the Nth node in linked list
	 * 
	 * @param index
	 * @return
	 */
	private int findNthNode(int index) {
		Node current = root;
		int count = 0;
		while (current != null) {
			if (count == index) {
				return current.nodeData;
			} else {
				count++;
				current = current.next;
			}

		}
		return 0;

	}

	/**
	 * This method is use to iterate the Linked List and display the data.
	 */
	public void traverseLinkedList() {
		Node node = root;
		while (node != null) {
			System.out.print(node.nodeData + " ");
			node = node.next;
		}
		System.out.println(" ");
	}

	public static class Node {
		int nodeData;
		Node next;

		/**
		 * @param num
		 * @param next
		 */
		public Node(int num, Node next) {
			this.nodeData = num;
			this.next = next;
		}

	}

}
