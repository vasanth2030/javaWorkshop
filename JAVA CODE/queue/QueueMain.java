package queue;

public class QueueMain {
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.printQueue();
		
		q.dequeue();
		q.printQueue();

		q.dequeue();
		q.printQueue();
	}
}
