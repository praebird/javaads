package doublyLL;

public class Testeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DList dl = new DList();

		System.out.println("Print list - empty list.");
		dl.printLL();

		dl.insert(10);
		dl.insert(1);
		dl.insert(20);
		dl.insert(15);
		dl.insert(12);
		dl.insert(14);
		System.out.println("Print list - 1 10 12 14 15 20");
		dl.printLL();

		dl.delete(50); // Do nothing as element is not in list
		dl.delete(1); // Delete first node
		dl.delete(20); // Delete last node
		dl.delete(12); // Delete some node in list
		System.out.println("Print list - 10 14 15");
		dl.printLL();
	}
	}


