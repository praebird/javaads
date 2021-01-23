package queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		
		try(Scanner sc =new Scanner(System.in)){

			System.out.println("Enter Size of Queue");
		    int maxSize = sc.nextInt();
		    Queu queue = new  Queu(maxSize);
			    System.out.println(" Queue is Empty "+queue.isEmpty());
			    
			    System.out.println("Adding Elemnts to Queue");
			    queue.add(8);
			    queue.add(10);
			    queue.add(12);		    
			    queue.add(14);
			    queue.add(16);
			    queue.add(19);

			    queue.display();
			   
	            System.out.println("\n");
	            System.out.println(" Queue is Full "+queue.isFull());

	            queue.delete();
	            queue.delete();
	            queue.delete();
	            queue.delete();

	            queue.display();
	            System.out.println("\n");
	            System.out.println(" Queue is Full "+queue.isFull());
	            System.out.println(" Queue is Empty "+queue.isEmpty());   
			
		}
		catch(Exception e) {
			
			e.getMessage();
		}
	}
}
