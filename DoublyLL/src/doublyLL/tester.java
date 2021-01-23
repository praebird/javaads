package doublyLL;
import java.util.Scanner;
public class tester {

	   
    public static void main(String[] args) {  
          
        DoublyLL dList = new DoublyLL();  
          
        try(Scanner sc = new Scanner(System.in)){
    		boolean j = true;
    		do {
    		System.out.println("1. Add Element at front" +"\n2. Add Element at End "+"\n3. Display List");

    		System.out.println("4. Display Reverse List" + "\n5. Exit");
    		
    		int ch = sc.nextInt() ;
    		
    		
    		switch(ch) {
    		
    		
    		
    		case 1:
    			int s = sc.nextInt();
    			dList.AddToFront(s);
    			j = true;
    			break;
    			
    		case 2:
    			int s1 = sc.nextInt();
    			dList.addAtEnd(s1);
    			j = true;
    			break;
    			
    		case 3:
    			
    			dList.display();
    			j = true;
    			break;
    			
    		case 4:
    			
    			dList.reverseDisplay();
    			j = true;
    			
    			break;
    		
    			
    		case 5:
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
		
		

