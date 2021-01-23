package doublyLL;

 
public class DoublyLL {  
    
    //Represent a node of the doubly linked list  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
        }  
    }  
      
    //Represent the head and tail of the doubly linked list  
    Node head, tail = null; 
    
    
    public void AddToFront(int val){
    	
		Node newNode = new Node(val);
		newNode.next = head;
		newNode.previous=null;
		if(head != null)
			head.previous = newNode;
		head = newNode;
		if(tail==null)
			tail=newNode;
		          
    	    }  
    
    //addAtEnd() will add a node to the end of the list  
    public void addAtEnd(int val) {  
        //Create a new node  
        Node newNode = new Node(val);  
          
        //If list is empty  
        if(head == null) {  
            //Both head and tail will point to newNode  
            head = tail = newNode;  
            //head's previous will point to null  
            head.previous = null;  
            //tail's next will point to null, as it is the last node of the list  
            tail.next = null;  
        }  
        //Add newNode as new tail of the list  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
      
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
       while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    } 
    
    
    public void reverseDisplay() {  
        //Node current will point to head  
        Node current = tail;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
            //Prints each node by decrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.previous;  
        }  
        System.out.println();  
    } 
    
} 