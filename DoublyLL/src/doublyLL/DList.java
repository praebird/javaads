//Common Insert FUnctionality //remove

package doublyLL;

public class DList {
	
	public class DLNode {
		
		int data;
		DLNode prev;
		DLNode nxt;
		
	}
	
	private DLNode head,last;
	
	public DList(){
		
		head =null;
		last =null;
		
		
	}
	
	public void printLL() {
		DLNode curr = head;
		if(head == null)
			System.out.println("List Empty...!");
				
		while(curr !=null) {			
			System.out.println(curr.data+" ");
			curr=curr.nxt;
		}				
	}
	
	public void insert( int val) {
		
		DLNode d = new DLNode ();
		
		d.data = val;
		d.prev = null;
		d.nxt = null;
		
		if(head == null) {
			
			head = d;
			last = d;
			return ;
			
		}
		
		DLNode curr =head;
		
		while((curr != null) && (curr.data <d.data)) {
			
			curr = curr.nxt;
			
		}
		
		if(curr == head) {
			
			curr.prev = d;
			d.nxt = curr;
			head = d;
			return;
		}
		
		
		if(curr == null) {
			last.nxt =d;
			d.prev = last;
			last =d;
			return;
						
		}
		
		d.nxt = curr;
		d.prev = curr.prev;
		curr.prev.nxt =d;
		curr.prev = d;
		
	}
	
	@SuppressWarnings("unused")
	public void delete (int val) {
		
		DLNode curr =head;
		while((curr!=null)&&(curr.data!=val)) {
			curr = curr.nxt;
		}
		
		if(curr==null) {
			return;
		}
		
		if(curr==head) {			
			if(curr.nxt == null) {
			head = null;
			last =null;
			return;
			}
		
		curr.nxt.prev = null;
		head =curr.nxt;
		return;
		}
		if(curr==last) {
			
			curr.prev.nxt = null;
			last = curr.prev;
			return;
		}
		curr.prev.nxt = curr.nxt;
		curr.nxt.prev = curr.prev;
		return;
		
	}
	
	

}
