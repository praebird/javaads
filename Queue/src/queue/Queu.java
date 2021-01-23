package queue;

public class Queu implements QueueInt {

	private int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize = 0;
	
	
	public Queu(int maxSize) {
		this.capacity = maxSize;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	@Override
	public void add(int data) {
		if (isFull()) {
			System.out.println("Queue is full!! Can not add more elements");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");
		}
	}

	@Override
	public void delete() {
		if (isEmpty()) {
			System.out.println("Queue is empty!! Can not remove element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	@Override
	
	public boolean isEmpty() {
 
		if (front == rear) {
			return true;
		}
		return false;
	}
	@Override

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}
	
	public void display() {
		
		for (int i : queueArr )
			if(i!=0)
				System.out.print(i+" ");
	}
}
