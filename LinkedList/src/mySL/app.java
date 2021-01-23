package mySL;
import java.util.Scanner;
public class app {

	public static void main(String[] args) {
		
		SinglyLL sll = new SinglyLL();
		try(Scanner sc = new Scanner(System.in)){
		boolean j = true;
		do {
		System.out.println("1. Add Element at front" +"\n2. Display "+"\n3. Display Total Elements ");

		System.out.println("4. Display Total Occurences of an Element" + "\n5. Find an Element In List "+"\n6. Add Element at End"
		
				+" \n7. Delete A Node"+"\n10. Exit");
		
		int ch = sc.nextInt() ;
		
		
		switch(ch) {
		
		
		
		case 1:
			System.out.println("Enter Value to Added in List:");
			int val =sc.nextInt();
			sll.addAtFront(val);
			j = true;
			break;
			
		case 2:
			sll.printLL();
			System.out.println();
			j = true;
			break;
			
		case 3:
			
			System.out.println("Count of total elements==  "+sll.count());
			j = true;
			break;
			
		case 4:
			
			System.out.println("Enter No to be Checked:");
			int nc = sc.nextInt();			
			int tots=sll.countFreq(nc);			
			if (tots!=0)
				System.out.println("Total No of Occurences of " + nc + " in LL is " + tots );
			else {
				System.out.println(" No Occurences of " + nc + " is present in LL" );
				
			}
			j = true;
			
			break;
		case 5:
			System.out.println("Enter No to be Checked:");
			int no = sc.nextInt();
			if(sll.find(no)) {
				
				System.out.println("Number is present in LL ..!");
			}
			else {
				System.out.println("Number is NOT PRESENT in LL ..!");
			}
			
			j = true;
			break;
			
		case 6:
			System.out.println("Enter Value to Added in List:");
			int val2 =sc.nextInt();
			sll.addAtEnd(val2);
			
			j = true;
			break;
		
		case 7:
			System.out.println("Enter Value to Delete in List:");
			int val3 =sc.nextInt();
			sll.deleteAll(val3);
			//sll.deleteNode(c);
			j=true;
			break;
			
		case 10:
			j = false;
			break;
			
		default:
			System.out.println("Invalid Choice Please Try Again...!!");
			break;
		}
		}while(j!=false);
	
	}catch(Exception e ) {
		
		e.getMessage();
	}

	}
}
