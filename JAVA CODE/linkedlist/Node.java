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
	
	public static Node deleteNode(Node head,int pos)
	{
		if(pos==1)
		{
			return head.next;
		}
		
		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		return head;
		
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
