import java.util.Scanner;

public class TestCDLL {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in)){
       /* Creating object of linkedList */
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        System.out.println("\nCircular Doubly Linked List Operations\n");
        boolean j =false;
        
       /*  Perform list operations  */
        do
            {
               
                System.out.println("1. Insert at begining");
                System.out.println("2. Insert at end");
                System.out.println("3. Delete at position");
                System.out.println("4. Display total elements of Circular Doubly LL");
                System.out.println("5. Display Elements");
                System.out.println("10. Exit");
                
                int choice = scan.nextInt();
                switch (choice)
                    {
                    case 1 :
                        System.out.println("Enter integer element to insert");
                        list.insertAtStart(scan.nextInt() );
                        break;
                    case 2 :
                        System.out.println("Enter integer element to insert");
                        list.insertAtEnd( scan.nextInt() );
                        break;
                    
                    case 3 :
                        System.out.println("Enter position");
                        int p = scan.nextInt() ;
                        if (p < 1 || p > list.getSize() )
                            System.out.println("Invalid position\n");
                        else
                        {
                        	if(list.deleteAtPos(p))
                        		{
                        		System.out.println("Deleted succesfully...!");
                        		}
                        
                        	else {
                        	System.out.println("Delete failed");
                        	}
                        }
                            
                        break;
                    
                    case 4 :
                        System.out.println("Size = "+ list.getSize() +"\n");
                        break;
                       
                    case 5:

                       list.printList();
                       break;
                       
                    case 10:
                    	
                    	j=true;
                    	break;
                    	
                    
                        
                    default :
                        System.out.println("Wrong Entry\n ");
                        break;
                    }
                
              
                
            }
        while (j!= true);
        }catch(Exception e) {
    	e.getMessage();
        }
    }
}
