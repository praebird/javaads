public class CircularDoublyLinkedList
{
	
	class Node
	{
	    private int data;
	    private Node next, prev;
/*
	    public Node()
	    {
	    	int data;
	        Node next;
	        Node prev;
	        
	    }
	   /* Constructor */
	    public Node(int d, Node n, Node p)
	    {
	        data = d;
	        next = n;
	        prev = p;
	    }
	}
	
	
	private Node head;
    private Node last ;
    public int size;

   /* Constructor */
    public CircularDoublyLinkedList()
    {
    	head = null;
    	last = null;
        size = 0;
    }
    
   /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return head == null;
    }
    
   /* Function to get size of list */
    public int getSize()
    {
        return size;
    }
    
    
    
   /* Function to insert element at begining */
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null, null);
        if (head == null)
            {
                
                nptr.next=nptr;
                nptr.prev = nptr;
                head = nptr;
                last = head;
            }
        else
            {
        		
        		
        		nptr.prev = last;
        		last.next = nptr;
        		head.prev=nptr;
        		nptr.next=head;
           
        		head = nptr;
            }
        size++ ;
    }
    
    
    
   /*Function to insert element at end */
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val, null, null);
        if (head == null)
            {
        	
        		nptr.next=nptr;
        		nptr.prev=nptr;
               
        		head = nptr;
        		last = head;
            }
        else
            {
        	
        		nptr.prev = last;
        		last.next=nptr;
        		head.prev=nptr;
        		nptr.next=head;
               
                
        		last = nptr;
            }
        size++;
    }
     
    
   
   /* Function to delete node at position  */
    public boolean deleteAtPos(int pos)
    {
        if (pos == 1)
            {
                if (size == 1)
                    {
                	head = null;
                	last = null;
                    size = 0;
                    return true;
                    }
                
                head=head.next;
                head.prev=last;
                
                size--;
                return true ;
            }
        if (pos == size)
            {
        	
        	last = last.prev;
        	last.next=head;
        	head.prev=last;        	
            size-- ;
            return true;
            }
        
        Node ptr =head.next;
       for (int i = 2; i <= size; i++)
            {
                if (i == pos)
                    {
                	
                		Node p = ptr.prev;
                		Node n = ptr.next;
                       
                		p.next=n;
                		p.prev=p;
                        size-- ;
                        return true;
                    }
                 ptr = ptr.next;
            }
       return false;
       
       
    }
    
    
   /* Function to display status of list */
    public void printList()
    {
        System.out.print("\nCircular Doubly Linked List = ");
        Node ptr = head;
        if (size == 0)
            {
                System.out.print("List Empty\n");
                return;
            }
        if (head.next == head)
            
           {
               System.out.print(head.data+ " , "+ptr.data+ "\n");
                return;
            }
       
        
        
        System.out.print(head.data+ ",");
        ptr = head.next;
        while (ptr.next != head)
            {
                System.out.print(ptr.data+ ",");
                ptr = ptr.next;
            }
        System.out.print(ptr.data+ ",");
        ptr = ptr.next;
        System.out.print(ptr.data+ "\n");
                
        
    }
}

