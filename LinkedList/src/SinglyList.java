
public class SinglyList {
	public class SListNode {
		int data;
		SListNode next;
	}

	private SListNode head;

	public SinglyList() {
		head = null;
	}

	public void addAtFront(int no) {
		SListNode n = new SListNode(); // 1. Create a new node.
		n.data = no; // 2. Store data in new node.
		n.next = head; // 3. Make head node come after new node.
		head = n; // 4. Make new node as head.
	}

	public void printList() {
		SListNode curr = head; // 1. Set curr to head.
		while (curr != null) { // 2.
			System.out.println(curr.data); // 2.1 Process curr's data
			curr = curr.next; // 2.2 Make curr point to curr's next node.
		}
	}
	
	public int count() {
		SListNode curr=head;
		int count=0;
		while(curr != null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public int countFrequency(int no) {
		SListNode curr=head;
		int frequency=0;
		while(curr != null) {
			if(curr.data==no) {
				frequency++;
			}
			curr=curr.next;
		}
		return frequency;
	}
	
	public boolean find(int no) {
		SListNode curr=head;
		
		while(curr != null) {
			if(curr.data==no) {
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	
}
