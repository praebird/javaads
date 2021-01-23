package stack;
public class MyStack implements StackIntf {

	private int[] stack;
	private int top=-1;
	private int[] arr;
	public MyStack(int size) {
		stack=new int[size];
		arr =new int[size];
	}
	
	@Override
	public void push( int x) {
		if(!isFull()) {
			++top;
			stack[top]=x;
			System.out.println(x+" Added to The Stacks");
		}
		else
			System.out.println("Stack is full !!");
		
	}

	@Override
	public void pop() {
		if(!isEmpty()) {
			int temp=stack[top];
			stack[top]=0;
			top--;
			System.out.println(temp +" Removed from Stack");
		}
		else
			System.out.println("Stack is Empty !!");
		
	}

	int i=0;
	public int[] reverse() {
		while(!isEmpty()) {
			int t2=stack[top];
			top--;
			arr[i]=t2;
			i++;
		}
			//System.out.println("Stack is Empty !!");	
		return arr;
	}
	
	
	
	@Override
	public boolean isFull() {
		if(top==stack.length-1)
			return true;
		
		return false;
		
	}

	@Override
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
		
	}

	@Override
	public void display() {
		for(int i:stack) {
			if(i != 0) {
				System.out.println(i +" ");
			}
		}
		
	}
}	

