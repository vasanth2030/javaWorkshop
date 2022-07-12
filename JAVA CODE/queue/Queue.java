package queue;

public class Queue {
	int arr[];
	int capacity;
	int rear,front;
	
	Queue(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		rear=front=0;
	}
	
	public void enqueue(int data)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
			return;
		}
		
		arr[rear++]=data;
	}
	
	public void dequeue()
	{
		if(rear==front)
		{
			System.out.println("Queue is empty");
			return;
		}
		
		for(int i=0;i<rear-1;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
