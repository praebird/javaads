package mySL;

public class SinglyLL {

	public class SinglyLLnode{
		
		int data;
		SinglyLLnode nxt;
		
	}
	
	private SinglyLLnode head;

	private SinglyLLnode last;
	
	public SinglyLL() {
		head =null;
		last = null;
	}
	public void addAtFront(int val) {
		
		SinglyLLnode nd1 = new SinglyLLnode();
		//1 Create A node		
		
		
		nd1.data =val; //2.store the value	
		nd1.nxt = head;  // 3 . Make head node come after new node		
		head = nd1; //4 Make New Node as Head
		
		System.out.println(val + " added Succesfully..!");
	}
	
	public void addAtEnd(int val) {
		
		 //1 Create A node		
		
		SinglyLLnode nd1 = new SinglyLLnode();
		
		nd1.data =val; //2.store the value	
		nd1.nxt = null;
		head = nd1;
		
		
		//System.out.println("Over Here");
		
        if(head != null) {  //2 Checks if the list is empty  
            //If list is empty, both head and last will point to new node  
            //head = nd1;  
            //last = nd1;  
        } 
        
        else {  
            //newNode will be added after tail such that last's next will point to newNode  
        	last.nxt = nd1;  
            
        	nd1 = last;  // //newNode will become new last of the list 
        } 
        System.out.println(val + " added Succesfully..!");
	}
	
	public boolean  deleteNode(SinglyLLnode c) {

		if(c.nxt == null) {
			return false;
			
		}
		c.data = c.nxt.data;
		c.nxt =c.nxt.nxt;
		
		return false;
	}
	
	@SuppressWarnings("null")
	public boolean  deleteAll(int val) {


		SinglyLLnode thisNode = head;
		boolean done =true;
		
		while(thisNode != null) {
			while(thisNode.data ==val) {
				done = deleteNode(thisNode);
					if(!done) {
							break;
					}
		}
	}
		thisNode =thisNode.nxt;
		return done;
	}
	
	public void printLL() {
		

		SinglyLLnode thisNode = head;
		while(thisNode != null) {
			System.out.print("\n"+thisNode.data + "   ");
			thisNode = thisNode.nxt;
		}
		
		
	}
	
	public int count() {
		int cnt=0;
		SinglyLLnode thisNode = head;
		while(thisNode != null) {
		thisNode = thisNode.nxt;
		cnt++;
		}
		return cnt;
	}
	
	public int countFreq(int d) {
		int cnt=0;
		SinglyLLnode thisNode = head;
		while(thisNode != null) {
			if(thisNode.data == d)
				{
					cnt++;
				}
		thisNode = thisNode.nxt;
			}
			return cnt;
		
	}
	
	public boolean find(int no) {
		SinglyLLnode thisNode = head;
		while(thisNode != null) {
			if(thisNode.data == no)
			{
				return true;
			}
			thisNode = thisNode.nxt;
			return false;
		}		
		return false;
	}
		
}
