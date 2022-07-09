package linkedlist;


public class LinkedListMain {
	public static void main(String[] args) {
		Node head = new Node(10);
		Node.insertAtEnd(head,20);
		Node.insertAtEnd(head,30);
		Node.insertAtEnd(head,40);
		Node.insertAtEnd(head,50);
		
		Node.printLikedList(head);
		
		head=Node.deleteNode(head, 3);
		Node.printLikedList(head);
	}
	
}
