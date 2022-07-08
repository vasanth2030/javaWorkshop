package linkedlist;

public class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next  = null;
	}

	public static void insertAtEnd(Node head, int data) {
		Node newNode = new Node(data);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}

	public static void printLikedList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " --> ");
			curr = curr.next;
		}
		System.out.println();
	}

}
