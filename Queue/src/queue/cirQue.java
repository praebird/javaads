package queue;

public class cirQue implements QueueInt {

	int maxSize;
	int rear;
	int front;
	int aQueue[];
	{
	    rear = -1;
	    front = -1;
	}
	
	cirQue(int maxSize)
	{
	    this.maxSize = maxSize;
	    this.aQueue = new int[maxSize];
	}
	
	@Override
	public void add(int n) {
		
		    if(!isFull())
		    {
		        if (rear == front && front == -1)
		        {
		            front += 1;
		        }
		        rear = (rear+1) % maxSize;
		        aQueue[rear] = n;
		    }
		    else {
		    	
		    	System.out.println("Queue is FULL");
		    }
	}

	@Override
	public void delete() {
		 if(!isEmpty())
		    {
		        int item = aQueue[front];
		         aQueue[front] = -1;
		       
		        
		        {
		            front = (front + 1) % maxSize;
		        }
		        System.out.println(item + " is removed from the Circular Queue");
		    }
		 else {
		    	
		    	System.out.println("Queue is EMPTY");
		    }
	}
	
	
	
	@Override
	public boolean isEmpty() {

		if(rear == front && rear == -1)
		    {
		        return true;
		    }
		return false;
	}

	@Override
	public boolean isFull() {
		
		if(((rear+1) % maxSize) == front)
		    {
			return true;
		    }
		return false;
	}
	

	public void display() {
		
		for (int i : aQueue )
			if(i!=0)
				System.out.print(i+" ");
	}


}
